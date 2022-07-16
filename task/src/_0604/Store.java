package _0604;

import java.util.Arrays;

//Product 3개
public class Store {
    private String name;
    private Product[] products = new Product[3];

    public Store(String name) {
        this.name = name;
    }

    public boolean isEqualStoreName(String name) {
        return this.name.equals(name);
    }

    public void makeProduct(String productName) {
        int productIndex = -1;

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                productIndex = i;
                break;
            }
        }

        if (productIndex == -1) {
            System.err.println("공간이 없어요.");
            return;
        }

        Product p = new Product(productName);
        products[productIndex] = p;
    }

    @Override
    public String toString() {
        return this.name + "=" + Arrays.toString(products);
    }
}
