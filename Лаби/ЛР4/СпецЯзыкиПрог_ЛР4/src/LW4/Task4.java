package LW4;

public class Task4 {
    public String pf = "public field";
    private String prs = "private field";


    public static void main(String[] args) {
        Task4 t4 = new Task4();
        t4.task4();
        //System.out.println(var);
        //System.out.println(finalVar);
    }

    public void task4() {
        class LocalClass {
            int var = 3;
            final int finalVar = 4;

            public void print() {
                System.out.println(pf);
                System.out.println(var);
                System.out.println(finalVar);
                // System.out.println(prf);
            }

  /*          public static void main(String[] args) {
                LocalClass lc = new LocalClass();
                lc.print();
            } */
        }
    }
}
