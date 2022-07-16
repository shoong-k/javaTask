package _0625;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department d1 = new Department("롯데");

        d1.createStore("삼성");
        d1.createStore("LG");
        d1.createStore("현대");
        d1.createStore("포스코");
        d1.createStore("한화");

        d1.createProduct("삼성", "노트북");
        d1.createProduct("삼성", "이어폰");
        d1.createProduct("삼성", "마우스");
        d1.createProduct("삼성", "모니터");

        d1.createProduct("LG", "노트북");
        d1.createProduct("LG", "이어폰");
        d1.createProduct("LG", "마우스");

        d1.createProduct("현대", "노트북");
        d1.createProduct("현대", "이어폰");

        System.out.println(Arrays.toString(d1.getProductsByStoreName("삼성")));
        System.out.println(Arrays.toString(d1.getProductsByStoreName("현대")));
        System.out.println(Arrays.toString(d1.getProductsByStoreName("한화"))); //그런가게 없어요 떠야 하는데? 맞나?

        System.out.println(Arrays.toString(d1.findStoreByProductsCount(3)));
        System.out.println(Arrays.toString(d1.findStoreByProductsCount(2)));
    }
}
