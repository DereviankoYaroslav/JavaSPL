import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1999, 733, 20203030};
        String[] element = new String[]{"fire", "water", "earth", "air"};

        System.out.print("Виведення масиву елементів стихій за допомогою циклу for - ");
        for (int i = 0; i < 4; i++) {
            System.out.print(element[i] + " ");
        }

        System.out.println();

        System.out.print("Виведення цілочисельного масиву за допомогою циклу for - ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayInt[i] + " ");
        }

        System.out.println();

        System.out.println("Виведення масиву елементів стихій за допомогою toString - " + Arrays.toString(element));
        System.out.println("Виведення цілочисельного масиву за допомогою toString - " + Arrays.toString(arrayInt));

    }
}
