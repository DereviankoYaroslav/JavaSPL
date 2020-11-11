public class Task3 {

    public static void main(String[] args) {

        int classFieldVariable;
        int x = 11;

        if (x > 10) {
            String local = "Local value";
            classFieldVariable = 12;
            System.out.println("Локальна змінна - " + local);
            System.out.println("Змінна всередині класу методу - " + classFieldVariable);
        }
        classFieldVariable = 13;
        System.out.println("Змінна класу поза методом - " + classFieldVariable);


    }
}
