package LW5;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Виберіть серед варіантів і введіть число");
        task6();
    }

    private static void task6() {
        System.out.println("1 - Exception 1");
        System.out.println("2 - Exception 2");
        try {
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    throw new Exception1LW5();
                case 2:
                    throw new Exception2LW5();
            }
        } catch (Exception1LW5 | Exception2LW5 ex1or2) {
            System.out.println("Cтек виклику для ex1or2 - "+Arrays.toString(ex1or2.getStackTrace()));
            try {
                throw new Exception3LW5();
            } catch (Exception3LW5 ex3) {
                System.out.println("Cтек виклику для ex3 - "+Arrays.toString(ex3.getStackTrace()));
            }
        }
    }
}
