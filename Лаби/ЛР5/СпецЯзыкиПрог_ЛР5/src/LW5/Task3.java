package LW5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        task3v1("t3file1.txt", "t3file2.txt");
        task3v2("t3file1v2.txt", "t3file2v2.txt");
        System.out.println("Копіювання завершено");
    }

    private static void task3v1(String fileName1, String fileName2) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
             FileOutputStream fileOutputStream = new FileOutputStream(fileName2)) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer, 0, buffer.length);
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void task3v2(String fileName1, String fileName2) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
             FileOutputStream fileOutputStream = new FileOutputStream(fileName2)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
