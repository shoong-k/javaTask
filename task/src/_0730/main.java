package _0730;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        Task task = new Task();

        String[] a = task.createOddNumberOrNullArray(4);
        String[] b = task.createOddNumberOrNullArray(4);
        //String[] c = task.createOddNumberOrNullArray(5);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        //System.out.println(Arrays.toString(c));


        String[] d = task.sumTwoArray(a,b);
        System.out.println(Arrays.toString(d));

    }
}
