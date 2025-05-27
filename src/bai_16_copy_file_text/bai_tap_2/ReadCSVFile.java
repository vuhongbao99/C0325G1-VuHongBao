package bai_16_copy_file_text.bai_tap_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String csvFile = "countries.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                if (fields.length >= 3) {
                    int id = Integer.parseInt(fields[0].trim());
                    String code = fields[1].trim();
                    String name = fields[2].trim();

                    System.out.println("Country [ID=" + id + ", Code=" + code + ", Name=" + name + "]");
                }
            }
        } catch (IOException e) {
            System.out.println(" Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

