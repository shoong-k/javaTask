package _0625_1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws IOException {
        String string = "Hello";

        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);

        InputStream inputStream = new ByteArrayInputStream(bytes);
        //InputStream inputStream = new FileInputStream("test");

        byte[] buffer = new byte[2];
        System.out.println(Arrays.toString(buffer));

//        inputStream.read(buffer);
//        System.out.println(Arrays.toString(buffer));
//
//        String newString = new String(buffer, StandardCharsets.UTF_8);
//        System.out.println(newString);
//
//        inputStream.read(buffer);
//        System.out.println(Arrays.toString(buffer));
//
//        String newString1 = new String(buffer, StandardCharsets.UTF_8);
//        System.out.println(newString1);
//
//        int len = inputStream.read(buffer);
//        System.out.println(Arrays.toString(buffer));
//
//        String newString2 = new String(buffer, 0, len, StandardCharsets.UTF_8);
//        System.out.println(newString2);
//
//        int len2 = inputStream.read(buffer);
//        System.out.println(len2);


        while (true) {
            int len = inputStream.read(buffer);

            if (len == -1) {
                break;
            }

            String newString = new String(buffer, 0,len,StandardCharsets.UTF_8);
            System.out.println(newString);
        }

        System.out.println("end");
    }
}
