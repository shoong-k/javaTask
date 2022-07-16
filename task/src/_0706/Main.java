package _0706;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");
        d.createStore("삼성");
        d.createStore("LG");
        d.createProduct("삼성", "마우스");
        d.createProduct("LG", "마우스");
        d.createProduct("LG", "모니터");

        List<String> storeNames1 = d.findStoreNamesByProductName("모니터");
        List<String> storeNames2 = d.findStoreNamesByProductName("마우스");
        List<String> storeNames3 = d.findStoreNamesByProductName("핸드폰");

        System.out.println(storeNames1);
        System.out.println(storeNames2);
        System.out.println(storeNames3);

    }

    public static void printName(Department d) {
        System.out.println(d.getName());
    }

    public static void printName(NameGettable n) {
        System.out.println(n.getName());
    }
}
