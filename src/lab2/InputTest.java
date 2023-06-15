package lab2;

import java.io.IOException;

public class InputTest {
    public static void main(String[] args) throws IOException {
        byte[] input = System.in.readAllBytes();
        for (byte b: input) {
            System.out.println(b);
        }
    }
}
