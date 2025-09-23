package com.inoutmate;

import java.io.FileWriter;
import java.time.LocalDateTime;

public class AttendanceLogger {
    private final String file = "data/attendance.txt";

    public void logEntry(String empId, String method) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(LocalDateTime.now() + " | " + empId + " | " + method + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
