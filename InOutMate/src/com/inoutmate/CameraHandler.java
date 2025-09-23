package com.inoutmate;

import org.opencv.videoio.VideoCapture;
import org.opencv.core.Mat;

public class CameraHandler {
    FaceRecognition recognizer = new FaceRecognition();

    public String checkForFace() {
        VideoCapture camera = new VideoCapture(0);
        if (!camera.isOpened()) {
            System.out.println("Error: Camera not found!");
            return null;
        }

        Mat frame = new Mat();
        camera.read(frame);

        String empId = recognizer.recognize(frame);
        camera.release();
        return empId; // null if unknown
    }
}
