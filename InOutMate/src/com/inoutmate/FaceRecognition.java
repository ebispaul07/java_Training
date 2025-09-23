package com.inoutmate;

import org.opencv.core.Mat;

public class FaceRecognition {
    // Dummy recognizer for now
    public String recognize(Mat frame) {
        // Simulated recognition
        double rand = Math.random();
        if (rand < 0.4) return "emp101"; 
        else if (rand < 0.8) return "emp102"; 
        else return null; // unknown
    }
}
