package _0625_1;

public class Main2 {
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;

        for (int number: ints) {
            System.out.println(number);
        }

        String[] strings = new String[2];
        strings[0] = "삼성";
        strings[1] = "롯데";

        for(String s: strings) {
            System.out.println(s);
        }
    }
}
