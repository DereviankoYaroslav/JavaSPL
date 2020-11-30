package LW5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    private static void task6() {
        System.out.println("1: Exception 1" + System.lineSeparator() + "2: Exception 2");
        try {
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> throw new Exception1LW5();
                case 2 -> throw new Exception2LW5();
            }
        } catch (Exception1LW5 | Exception2LW5 myException1) {
            System.out.println(Arrays.toString(myException1.getStackTrace()));
            try {
                throw new Exception3LW5();
            } catch (Exception3LW5 myException3) {
                System.out.println(Arrays.toString(myException3.getStackTrace()));
            }
        }
    }

    public static void task1() {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(scanner.nextLine());
            System.out.println("String Builder capacity: " + stringBuilder.capacity());
        }
    }

    public static void task2(String str) {
        for (char c : str.toCharArray()) {
            System.out.println(c);
            System.out.println("Number: " + (!Character.isLetter(c) && !Character.isSpaceChar(c)));
            System.out.println("Symbol: " + Character.isLetter(c));
            System.out.println("Upper case: " + Character.isUpperCase(c));
            System.out.println("Is space: " + Character.isSpaceChar(c));
            System.out.println();
        }
    }

    private static void task3(String fileName1, String fileName2) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
             FileOutputStream fileOutputStream = new FileOutputStream(fileName2)) {
            int a;
            while ((a = fileInputStream.read()) != -1) {
                fileOutputStream.write(a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void task4() {
        String filename;
        while (true) {
            System.out.println("Input file name: ");
            filename = new Scanner(System.in).nextLine();
            if ("".equals(filename)) {
                System.out.println("Work with program ended");
                break;
            }
            try (FileInputStream fis = new FileInputStream(filename)) {
                int a;
                while ((a = fis.read()) != -1) {
                    System.out.printf("%X ", a);
                }
                System.out.println();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void task5() {
        try (CloseableLW5 closeableLW5 = new CloseableLW5()) {
            System.out.println("Work");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
