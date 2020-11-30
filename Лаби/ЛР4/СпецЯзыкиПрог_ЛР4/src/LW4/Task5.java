package LW4;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Start Encription");
        byte[] shifr = StreamEncryptionImpl.encrypt("Test Encription".getBytes());
        System.out.println(Arrays.toString(shifr));
        System.out.println("Start Decription");
        System.out.println(new String(StreamEncryptionImpl.decrypt(shifr)));
    }
}
