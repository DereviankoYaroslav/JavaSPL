package LW4;

public class Task6 {

    public void print() {
    }

    public static void main(String[] args) {
        Task6 t6;
        t6 = new Task6() {
            @Override
            public void print() {
                System.out.println("Variant I");
            }
        };
        t6.print();
        t6 = new Task6() {
            @Override
            public void print() {
                System.out.println("Variant II");
            }
        };
        t6.print();
        t6 = new Task6() {
            @Override
            public void print() {
                System.out.println("Variant III");
            }
        };
        t6.print();
        new Task6() {
            @Override
            public void print() {
                System.out.println("Variant IV without variable declaration");
            }
        }.print();
    }
}
