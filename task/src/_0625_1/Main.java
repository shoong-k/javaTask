package _0625_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");
        System.out.println(d);

        d.createStore("삼성");
        System.out.println(d);

        d.createStore("LG");
        System.out.println(d);

        d.createProduct("삼성", "마우스");
        System.out.println(d);

        d.createProduct("삼성", "노트북");
        System.out.println(d);

        d.createProduct("LG", "마우스");
        System.out.println(d);

        System.out.println(d.findStoreNamesByProductName("마우스")); //삼성, LG
        System.out.println(d.findStoreNamesByProductName("노트북")); //삼성
    }
}
