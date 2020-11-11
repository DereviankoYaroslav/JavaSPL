import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть до якої межі потрібно шукати прості числа: ");
        int n = in.nextInt();
        int[] isPrime = new int[n];

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = i + 1;
        }
        int[] isPrime2 = new int[n];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime2[i] = isPrime[i];
        }

        for (int i = 1; i < isPrime.length; i++) {
            for (int k = 1; k < isPrime.length; k++)
                if (isPrime[k] != isPrime[i] && isPrime[k] % isPrime[i] == 0) {
                    isPrime2[k] = 0;
                }
        }

        int calc = 0;
        for (int i = 0; i < isPrime2.length; i++) {
            if (isPrime2[i] != 0) {
                calc++;
            }
        }

        int[] isPrime3 = new int[calc];
        int u = 0;
        for (int k = 0; k < isPrime2.length; k++) {
            if (isPrime2[k] != 0) {
                isPrime3[u] = isPrime2[k];
                u++;
            }
        }

        System.out.println("Масив простих чисел:");
        for (int i = 1; i < isPrime3.length; i++) {
            System.out.print("[" + isPrime3[i] + "] ");
        }

    }
}

