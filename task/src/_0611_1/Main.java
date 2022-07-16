package _0611_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");

        d.addStore("삼성");
        d.addStore("LG");
        d.addStore("애플");

        System.out.println(d);

        d.addProduct("삼성", "칫솔");
        d.addProduct("삼성", "치약");
        d.addProduct("삼성", "샴푸");
        d.addProduct("삼성", "샴푸");
        d.addProduct("LG", "샴푸");
        System.out.println(d);

        String[] strings = d.findStoreByProduct("린스");
        System.out.println(Arrays.toString(strings));
    }
}
