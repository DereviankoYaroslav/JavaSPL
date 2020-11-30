package LW5;

import java.io.Closeable;
import java.io.IOException;

public class CloseableLW5 implements Closeable {

    CloseableLW5(){
        System.out.println("Створення");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Закриття");
    }
}
