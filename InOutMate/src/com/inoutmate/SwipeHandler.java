package com.inoutmate;

import java.util.Scanner;

public class SwipeHandler {
    Scanner sc = new Scanner(System.in);

    public String waitForSwipe(int seconds) {
        System.out.println("Swipe your ID (type ID and press Enter), or wait...");

        long start = System.currentTimeMillis();
        while ((System.currentTimeMillis() - start) < seconds * 1000) {
            if (sc.hasNextLine()) {
                return sc.nextLine().trim();
            }
        }
        return null; // no swipe
    }
}
