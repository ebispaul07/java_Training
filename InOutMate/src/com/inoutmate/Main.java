package com.inoutmate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== InOutMate Employee Access Monitoring ===");

        // Load OpenCV native library
        System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);

        CameraHandler camera = new CameraHandler();
        SwipeHandler swipe = new SwipeHandler();
        AttendanceLogger logger = new AttendanceLogger();
        NotificationService notifier = new NotificationService();

        while (true) {
            System.out.println("\nWaiting for swipe... (5 seconds)");

            // give 5 seconds for swipe
            String empId = swipe.waitForSwipe(5);

            if (empId != null) {
                // employee swiped
                logger.logEntry(empId, "SWIPE");
                notifier.notifyEmployee(empId, "Login Successful via Swipe");
                notifier.notifyAdmin("Employee " + empId + " logged in via swipe.");
            } else {
                // no swipe → check camera
                String recognizedId = camera.checkForFace();

                if (recognizedId == null) {
                    logger.logEntry("UNKNOWN", "NO-SWIPE");
                    notifier.notifyAdmin("⚠️ Unknown person entered without swipe!");
                } else {
                    logger.logEntry(recognizedId, "NO-SWIPE");
                    notifier.notifyEmployee(recognizedId, 
                        "⚠️ You entered without swiping. Please swipe next time.");
                    notifier.notifyAdmin("⚠️ Employee " + recognizedId + " entered without swipe!");
                }
            }

            // wait before next loop
            try { Thread.sleep(5000); } catch (Exception e) {}
        }
    }
}
