package _0604;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");
        System.out.println(d);

        d.makeStore("삼성");
        System.out.println(d);

        d.makeStore("LG");
        System.out.println(d);

        d.makeProduct("LG", "칫솔");
        System.out.println(d);

        d.makeProduct("LG", "치약");
        d.makeProduct("LG", "비누");
        d.makeProduct("LG", "샴푸");
        System.out.println(d);

        d.makeProduct("애플", "칫솔");

    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static void printNumber(int number) {
        System.out.println("받은 숫자는 " + number + "입니다.");
    }

    public static int getNumber() {
        return 5;
    }

    public static int add(int a, int b) {
        int add = a + b;
        return add;
    }

    public static void printNames(String[] strings) {
        for (int i=0; i< strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static int findIndex(String[] strings) {
        for (int i=0; i < strings.length; i++) {
            if (strings[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findIndexes(String[] strings) {
        int count = 0;

        for (int i=0; i < strings.length; i++) {
            if (strings[i] == null) {
                count ++;
            }
        }

        int[] indexes = new int[count];
        int index = 0;

        for (int i= 0; i < strings.length; i++) {
            if (strings[i] == null) {
                indexes[index] = i;
                index ++;
            }
        }
        return indexes;
    }

}
