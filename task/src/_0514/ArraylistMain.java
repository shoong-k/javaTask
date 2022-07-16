package _0514;

import java.util.ArrayList;

public class ArraylistMain {
    public static void main(String[] args) {
        ArrayList<Product> elems = new ArrayList<>();

//        elems.add(1);
//        elems.add("롯데");
        elems.add(new Product("우유"));
        elems.add(new Product("커피"));
        elems.set(0, new Product("물"));
//        elems.add(true);

        for(int i = 0; i<elems.size(); i++) {
            System.out.println(elems.get(i));
        }


    }
}
