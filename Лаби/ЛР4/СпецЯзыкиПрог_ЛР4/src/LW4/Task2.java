package LW4;

public class Task2 {


    public static void main(String[] args) {
        Task2 t2 = new Task2();
        t2.method0("Test", 5, 10.0, true, 'A');
        System.out.println();
        t2.method(new Object[]{"Test2", 15, 20.0, false, 'B'});
        System.out.println();
        t2.method1("Test3", 25, 30.0, true, 'C');

    }

    public void method0(String str, Integer i, Double d, Boolean b, Character c) {
        System.out.println(str.getClass().getName() + " " + str);
        System.out.println(i.getClass().getName() + " " + i);
        System.out.println(d.getClass().getName() + " " + d);
        System.out.println(b.getClass().getName() + " " + b);
        System.out.println(c.getClass().getName() + " " + c);
    }

    public void method(Object[] arr) {
        for (Object o : arr) {
            System.out.println(o.getClass().getName() + " " + o);
        }
    }

    public void method1(Object... arr) {
        for (Object o : arr) {
            System.out.println(o.getClass().getName() + " " + o);
        }
    }


}
