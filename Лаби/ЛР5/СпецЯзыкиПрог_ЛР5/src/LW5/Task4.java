package LW5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("��� ������� �������� ������ Stop ������ ���� �����");
        task4();
    }

    private static void task4() {
        while (true) {
            System.out.println("������ ����� �����");
            String filename = new Scanner(System.in).nextLine();
            if (filename.equals("Stop")) {
                System.out.println("����� � ��������");
                break;
            }
            try (FileInputStream fileInputStream = new FileInputStream(filename)) {
                int i;
                while ((i = fileInputStream.read()) != -1) {
                    System.out.printf("%X ", i);
                }
                System.out.println();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
