package _0618_1;

import _0618_1._2.App;

//import java.lang.String;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        products.add(new Product("마우스"));
        //products.add("hello");

        Product p = products.get(0);

        list.add("hello");
        //list.add(1);
        //list.add(true);

        //Product p = new Product();
        //list.add(new Product("마우스"));

        String s = list.get(0);

        Object object = list.get(0);
        String msg = (String) object;

        //App app = new App();
        double d = 1.1d;
        int iii = 1;

        double dd = (double) iii;
        int ii = (int) d;

        System.out.println(ii);

        Parent p1 = new Parent();
        p1.print();

        Child c = new Child();
        //c.printChild();
        c.print();

        Parent pp = (Parent) c;
        pp.print();

        List<Parent> parents = new ArrayList<>();
        parents.add(p1);
        parents.add(c);
        parents.add(pp);

        for (int i=0; i<parents.size(); i++) {
            Parent p2 = parents.get(i);
            p2.print();
        }
    }

}
