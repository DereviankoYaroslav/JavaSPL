public class Task9 {

    public static void main(String[] args) {
        int mult = 1;
        int i = 1;
        while (i < 10) {
            int value = i * 2 - 1;
            mult = mult * value;
            i++;
            if (mult < 10000) {
                System.out.printf("Непарне число, яке множиться на попередній результат множення: " + String.valueOf(value) + ", ");
                System.out.println("значення множення на цьому кроці: " + mult);
            }
        }
    }
}
