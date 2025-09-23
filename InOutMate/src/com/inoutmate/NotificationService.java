package com.inoutmate;

import java.io.FileWriter;
import java.io.IOException;

public class NotificationService {
    private final String file = "data/notifications.txt";

    public void notifyAdmin(String message) {
        write("[ADMIN] " + message);
    }

    public void notifyEmployee(String empId, String message) {
        write("[EMP " + empId + "] " + message);
    }

    private void write(String msg) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(msg + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("NOTIFICATION: " + msg);
    }
}
