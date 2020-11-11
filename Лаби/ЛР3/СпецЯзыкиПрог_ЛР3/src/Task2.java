import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        final int NMAX = 10;

        //виділення пам'яті для масиву
        int[][] matrix = new int[NMAX + 1][];

        for (int n = 0; n <= NMAX; n++) {
            matrix[n] = new int[n + 1];
        }

        //заповнення масиву
        for (int n = 0; n < matrix.length; n++)
            for (int k = 0; k < matrix[n].length; k++) {
                int number = -100;
                for (int i = 0; i <= k; i++)
                    number = number + (int) (Math.random() * 100);
                matrix[n][k] = number;
            }

        System.out.println("Двомірний невідсортований масив: ");
        for (int[] row : matrix) {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }

        System.out.println("Двомірний відсортований масив: ");
        for (int[] row : matrix) {
            for (int odd : row) {
                Arrays.sort(row);
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }

        System.out.println("Матриця з від'ємними значеннями: ");
        for (int[] row : matrix) {
            for (int odd : row) {
                Arrays.sort(row);
                if (odd > 0) break;
                System.out.printf("%4d", odd);

            }
            System.out.println();
        }
    }
}