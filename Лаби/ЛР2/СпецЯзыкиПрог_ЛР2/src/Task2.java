public class Task2 {
    public static void main(String[] args) {
        //приведення цілочиселних типів з допустимим розширенням діапазону
        byte b = 120;
        short sh;
        int i;
        long l;

        sh = (short) b;
        System.out.println("Число, приведене до типу short з типу byte " + sh);
        i = (int) b;
        System.out.println("Число, приведене до типу int з типу byte " + i);
        l = (long) b;
        System.out.println("Число, приведене до типу long з типу byte " + l);


        i = (int) sh;
        System.out.println("Число, приведене до типу int з типу short " + i);
        l = (long) sh;
        System.out.println("Число, приведене до типу long з типу short " + l);
        b = (byte) sh;
        System.out.println("Число, приведене до типу byte з типу short " + b);

        b = (byte) i;
        System.out.println("Число, приведене до типу byte з типу int " + b);
        l = (long) i;
        System.out.println("Число, приведене до типу long з типу int " + l);
        sh = (short) i;
        System.out.println("Число, приведене до типу short з типу int " + sh);

        i = (int) l;
        System.out.println("Число, приведене до типу int з типу long " + i);
        sh = (short) l;
        System.out.println("Число, приведене до типу short з типу long " + sh);
        b = (byte) l;
        System.out.println("Число, приведене до типу byte з типу long " + b);

        //приведення double до float, float до int з некоректним перетворенням (переповненням)
        double d = Double.MAX_VALUE;

        float fl = (float) d;
        System.out.println("Приведення double до float з перевовненням");
        System.out.println("double - " + d);
        System.out.println("float1 - " + fl);

        float fl2 = Float.MAX_VALUE;

        int i2 = (int) fl2 + 2;
        System.out.println("Приведення float до int з переповненням");
        System.out.println("float2 - " + fl2);
        System.out.println("int - " + i2);
    }
}
