public class Task1 {
    public static void main(String[] args) {
        //без ініціалізації
        byte b1;
        short sh1;
        int i1;
        long l1;
        float fl1;
        double d1;
        char ch1;
        boolean b11;

        //з ініціалізацією
        byte b2 = 127;
        short sh2 = 32767;
        int i2 = 2147483647;
        long l2 = 9223372036854775807L;
        float fl2 = 31.24f;
        double d2 = 3.14;
        char ch2 = 'a';
        boolean bl2 = true;

        //з обчисленням при ініціалізації
        byte b3 = 12 + 13;
        short sh3 = 100 + 100;
        int i3 = 10000 + 40000;
        long l3 = 9223372036854775805L + 10;
        float fl3 = 289 * 793;
        double d3 = 91.27 - 30.11;
        char ch3 = 'a' + 'a';
        boolean bl3 = (b3 < 100) && (sh3 > 100);

        System.out.println("Змінна типу byte в десятковому представленні - " + b3);
        System.out.println("Змінна типу short в десятковому представленні - " + sh3);
        System.out.println("Змінна типу int в в десятковому представленні - " + i3);
        System.out.println("Змінна типу long в в десятковому представленні - " + l3);
        System.out.println("Змінна типу float - " + fl3);
        System.out.println("Змінна типу double - " + d3);
        System.out.println("Змінна типу char - " + ch3);
        System.out.println("Змінна типу boolean - " + bl3);

        String convertByte = Integer.toHexString(b3).toUpperCase();
        String convertShort = Integer.toHexString(sh3).toUpperCase();
        String convertInt = Integer.toHexString(i3).toUpperCase();
        String convertLong = Integer.toHexString((int) l3).toUpperCase();

        System.out.println("Змінна типу byte в шістнадцятирічному представленні - " + convertByte);
        System.out.println("Змінна типу short в шістнадцятирічному представленні - " + convertShort);
        System.out.println("Змінна типу int в шістнадцятирічному представленні  - " + convertInt);
        System.out.println("Змінна типу long в шістнадцятирічному представленні  - " + convertLong);

        int r = 2147483647+10;
        System.out.println(r);

        double r2 = 2147483647.0+10.0;
        System.out.println(r2);

        int r3 = (int) r2;
        System.out.println(r3);

    }
}
