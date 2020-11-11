import java.util.Scanner;

public class Task6 {

    static final double CMTOM = 0.01;
    static final int MTOCM = 100;

    public static double convertMeterToCentiemeter(double m) {
        double cm = m * MTOCM;
        return cm;
    }

    public static double convertCentiemetrToMeter(double cm) {
        double m = cm * CMTOM;
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int convert;
        do {
            System.out.println("1. Перевести метри в сантиметри");
            System.out.println("2. Перевести сантиметри в метри");
            System.out.println("3. Вихід з програми");
            convert = in.nextInt();
            switch (convert) {
                case 1:
                    System.out.println("Введіть кількість метрів");
                    double m = in.nextDouble();
                    System.out.println(m + " метрів = " + convertMeterToCentiemeter(m) + " сантиметрів");
                    break;
                case 2:
                    System.out.println("Введіть кількість сантиметрів");
                    double cm = in.nextDouble();
                    System.out.println(cm + " сантиметрів = " + convertCentiemetrToMeter(cm) + " метрів");
                    break;
            }
        } while (convert > 0 & convert < 3);

    }

}
