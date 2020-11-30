package LW5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ ����-���� �����");
        String str = scanner.nextLine();
        task2(str);
    }

    public static void task2(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                System.out.println(ch + " - �����");
            } else if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    System.out.println(ch + " - ������ ��������� ������");
                } else {
                    System.out.println(ch + " - ������ �������� ������");
                }
            } else if (Character.isWhitespace(ch)) {
                System.out.println(ch + " - ������ ������");
                System.out.println();
            }
        }
    }
}
