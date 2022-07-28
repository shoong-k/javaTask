package _0723_increased_Array;

import java.util.Objects;

public class Store {
    private String name;
    private Product[] products = new Product[2];

    public Store(String name) {
        this.name = name;
        System.out.println(this.name + " store가 생성되었습니다.");
    }

    public boolean isEquals(String name) {
        return Objects.equals(name, this.name);
    }

    public void createProduct(String name) {
        int productIndex = productIndex();

        if(productIndex == -1) {
            System.err.println("빈 공간이 없습니다. 배열크기를" + products.length*2 + "로 늘립니다.");
            Product[] newProducts = new Product[products.length*2];
            for (int i=0; i<products.length; i++) {
                newProducts[i] = products[i];
            }

            newProducts[products.length] = new Product(name);
            products = newProducts;

        } else {
            products[productIndex] = new Product(name);
        }
    }

    private int productIndex() {
        for (int i=0; i<products.length; i++) {
            if(products[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
