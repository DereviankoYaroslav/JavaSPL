package LW5;

import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        task5();
    }

    private static void task5() {
        try (CloseableLW5 cls = new CloseableLW5()) {
            System.out.println("Робота з ресурсом, далі має відбутися автоматичне закриття");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
