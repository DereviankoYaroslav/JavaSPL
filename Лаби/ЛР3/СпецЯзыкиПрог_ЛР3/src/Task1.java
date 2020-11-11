import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("\n" + Arrays.toString(bubbleSort()));
    }

    //метод сортування
    public static int[] bubbleSort() {

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте довжину масиву: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        return arr;
    }
}