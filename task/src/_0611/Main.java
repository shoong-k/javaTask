package _0611;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //department 만들기
        Department d = new Department("롯데");

        //store 만들기
        d.addStore("삼성");
        d.addStore("LG");
        d.addStore("애플");

        //product 만들기
        d.addProduct("삼성", "칫솔");
        d.addProduct("LG", "칫솔");
        d.addProduct("삼성", "치약");
        d.addProduct("LG", "치약");
        d.addProduct("애플", "칫솔");

        d.findStoreHasProduct("치약");

        System.out.println(Arrays.toString(d.findStoresByProductNum(2)));
    }
}
