package LW5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("������ ����-��� ��������");
        task1();
    }

    public static void task1() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                stringBuilder.insert(0, scanner.nextLine());
                System.out.println("������� ���� (������ StringBuilder) - " + stringBuilder.capacity());
            } else {
                stringBuilder.append(scanner.nextLine());
                System.out.println("������� ���� (������ StringBuilder) - " + stringBuilder.capacity());
            }
        }
        System.out.println("ʳ����� �������� - " + stringBuilder.capacity());
        System.out.println("���� ������: " + stringBuilder.toString());
    }
}
