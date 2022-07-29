package _0730;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        Task task = new Task();

        String[] a = task.createOddNumberOrNullArray(4);
        String[] b = task.createOddNumberOrNullArray(4);
        String[] c = task.createOddNumberOrNullArray(5);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));


        String[] d = task.sumTwoArray(a,b);
        System.out.println(Arrays.toString(d));

        //System.out.println(a[0].length()+1);

        String e = "adc";
        System.out.println("e의 크기는 :" + e.length());

        System.out.println(task.createTableByArray(a));

    }
}
