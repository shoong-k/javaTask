package _0618;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");

        d.createStore("삼성");
        d.createStore("LG");
        d.createStore("애플");

        d.createProduct("삼성", "노트북");
        d.createProduct("삼성", "핸드폰");
        d.createProduct("삼성", "이어폰");
        d.createProduct("LG", "노트북");
        d.createProduct("LG", "핸드폰");
        d.createProduct("애플", "노트북");
        d.createProduct("애플", "핸드폰");
        d.createProduct("애플", "이어폰");

        String[] strings = d.findProductsByStoreName("삼성");
        System.out.println(Arrays.toString(strings));

        String[] strings2 = d.findProductsByStoreName("LG");
        System.out.println(Arrays.toString(strings2));

        String[] strings3 = d.findProductsByStoreName("애플");
        System.out.println(Arrays.toString(strings3));

        String[] strings4 = d.findStoreByProductName("이어폰");
        System.out.println(Arrays.toString(strings4));

        String[] strings5 = d.findStoreByProductName("노트북");
        System.out.println(Arrays.toString(strings5));

        String[] strings6 = d.findStoreByProductNum(3);
        System.out.println(Arrays.toString(strings6));

        String[] strings7 = d.findStoreByProductNum(2);
        System.out.println(Arrays.toString(strings7));

        String[] strings8 = d.findStoreByProductNum(1);
        System.out.println(Arrays.toString(strings8));
    }
}
