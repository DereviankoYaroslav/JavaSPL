package LW4;

public class Task3 {
    private String prf = "private field";
    public String pf = "public field";
    private static String prsf = "private static field";
    public static String psf = "public static field";

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        t3.print();
    }

    public void print() {
        Task3.StaticClass staticClass = new Task3.StaticClass();
        staticClass.print();
        Task3.NotStaticClass notStaticClass = new Task3.NotStaticClass();
        notStaticClass.print();

    }

    public static class StaticClass {
        public void print() {
            System.out.println(prsf + " is available from static class");
            System.out.println(psf + " is available from static class");
        }
    }

    public class NotStaticClass {
        public void print() {
            System.out.println(pf + " is available from not static class");
            System.out.println(prf + " is available from not static class");
            System.out.println(prsf + " is available from not static class");
            System.out.println(psf + " is available from not static class");
        }
    }

}
