package bai_16_copy_file_text.bai_tap_1;

import java.io.*;
import java.util.Scanner;

public class CopyTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);

            if (!sourceFile.exists()) {
                System.out.println("File nguồn không tồn tại.");
                return;
            }

            // Đọc từ file nguồn và ghi sang file đích
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(targetFile);

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("Đã sao chép nội dung từ file nguồn sang file đích thành công!");

        } catch (IOException e) {
            System.out.println(" Đã xảy ra lỗi khi sao chép: " + e.getMessage());
        }
    }
}

