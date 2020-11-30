package ЛР4;

import lab4.StreamEncryptionImpl;

import java.util.Arrays;

public class Task1 {
    private String privateAppField = "privateAppField";
    public String publicAppField = "publicAppField";
    private static String privateStaticAppField = "privateStaticAppField";
    public static String publicStaticAppField = "publicStaticAppField";

    public void print() {
        ЛР4.Task1.StaticClass staticClass = new ЛР4.Task1.StaticClass();
        staticClass.print();
        ЛР4.Task1.NotStaticClass notStaticClass = new ЛР4.Task1.NotStaticClass();
        notStaticClass.print();

    }

    public static class StaticClass {
        public void print() {
            System.out.println(privateStaticAppField + " is available from static class");
            System.out.println(publicStaticAppField + " is available from static class");
        }
    }

    public class NotStaticClass {
        public void print() {
            System.out.println(publicAppField + " is available from not static class");
            System.out.println(privateAppField + " is available from not static class");
            System.out.println(privateStaticAppField + " is available from not static class");
            System.out.println(publicStaticAppField + " is available from not static class");
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println(new ЛР4.Task1());
        System.out.println("Task 2");
        ЛР4.Task1 app = new ЛР4.Task1();
        app.method(new Object[]{"Hello", 1, 2.0, false, 't'});
        app.method1("Dadada", 4, 7., true, 'l');
        System.out.println("Task 3");
        app.print();
        System.out.println("Task 4");
        app.task4();
        System.out.println("Task 5");
        System.out.println("Hello");
        byte[] shifr = StreamEncryptionImpl.encrypt("Hello".getBytes());
        System.out.println(Arrays.toString(shifr));
        System.out.println(new String(StreamEncryptionImpl.decrypt(shifr)));
        System.out.println("Task 6");
        Runnable r1;
        r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("First realization");
            }
        };
        r1.run();
        r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Second realization");
            }
        };
        r1.run();
        r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Third realization");
            }
        };
        r1.run();
        new Runnable() {
            @Override
            public void run() {
                System.out.println("Easy");
            }
        }.run();
    }

    public void task4() {
        int var = 3;
        final int finalVar = 4;
        class LocalClass {
            public void print() {
                System.out.println(var);
                System.out.println(finalVar);
                ЛР4.Task1.this.print();
            }
        }
    }

    public void method(Object[] arr) {
        for (Object o : arr) {
            System.out.println(o.getClass().getName());
        }
    }

    public void method1(Object... arr) {
        for (Object o : arr) {
            System.out.println(o.getClass().getName());
        }
    }

    @Override
    public String toString() {
        return "Override App toString()";
    }
}
