import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть номер поверху, на який хочете відправитися (від 1 до 24)");
        int floor = in.nextInt();

        final int MAXFLOOR = 24;
        final int MINFLLOR = 1;

        if (floor >= MINFLLOR && floor <= MAXFLOOR) {
            System.out.println("Ви знаходитесь на " + floor + " поверсі");
        } else {
            System.out.println("Ви вказали неправильний поверх!");
        }

    }
}
