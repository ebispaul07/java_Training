package com.inoutmate;

import java.io.*;
import java.time.LocalDate;

public class ReportGenerator {
    public void generateDailyReport() {
        String inputFile = "data/attendance.txt";
        String outputFile = "data/reports/daily_report_" + LocalDate.now() + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter fw = new FileWriter(outputFile)) {

            fw.write("=== InOutMate Daily Report (" + LocalDate.now() + ") ===\n\n");
            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
            }
            fw.write("\nReport Generated Successfully.\n");
            System.out.println("Daily report generated: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
