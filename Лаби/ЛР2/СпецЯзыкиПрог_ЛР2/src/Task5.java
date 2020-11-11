import java.util.Scanner;

public class Task5 {
    public enum SingleDigits {
        NULL, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE
    }

    public static void main(String[] args) {
        while (true) {
            compare(SingleDigits.NULL);
        }
    }

    private static SingleDigits compare(SingleDigits singleDigits) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введіть ціле число - ");
        int i = in.nextInt();
        switch (singleDigits) {
            case NULL:
                if (i == 0) {
                    System.out.println(singleDigits.NULL);
                    break;
                }
            case ONE:
                if (i == 1) {
                    System.out.println(singleDigits.ONE);
                    break;
                }
            case TWO:
                if (i == 2) {
                    System.out.println(singleDigits.TWO);
                    break;
                }
            case THREE:
                if (i == 3) {
                    System.out.println(singleDigits.THREE);
                    break;
                }
            case FOUR:
                if (i == 4) {
                    System.out.println(singleDigits.FOUR);
                    break;
                }
            case FIVE:
                if (i == 5) {
                    System.out.println(singleDigits.FIVE);
                    break;
                }
            case SIX:
                if (i == 6) {
                    System.out.println(singleDigits.SIX);
                    break;
                }
            case SEVEN:
                if (i == 7) {
                    System.out.println(singleDigits.SEVEN);
                    break;
                }
            case EIGHT:
                if (i == 8) {
                    System.out.println(singleDigits.EIGHT);
                    break;
                }
            case NINE:
                if (i == 9) {
                    System.out.println(singleDigits.NINE);
                    break;
                }
            default:
                System.out.println("Введене число не належить перечисленню enum");
                break;
        }
        return singleDigits;
    }

}
