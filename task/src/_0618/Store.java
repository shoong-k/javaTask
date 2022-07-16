package _0618;

import java.util.Arrays;
import java.util.Objects;

public class Store {
    private String name;
    private Product[] products = new Product[3];

    public Store(String name) {
        this.name = name;
    }

    public boolean isEqualsName(String name) {
        return Objects.equals(name, this.name);
    }

    public void createProduct(String name) {
        int emptyProductIndex = findEmptyProductIndex();

        if (emptyProductIndex == -1) {
            System.err.println("product를 생성할 빈 공간이 store에 없어요.");
        }

        products[emptyProductIndex] = new Product(name);
    }

    private int findEmptyProductIndex() {
        for (int i=0; i<products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean isExistProduct(String productName) {
        for (int i=0; i<products.length; i++) {

            if(products[i] == null) {
                continue;
            }

            if (products[i].isEqualsName(productName)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String[] getProducts() {
        int productsCount = 0;

        for(int i=0; i< products.length; i++) {
            if(products[i] != null) {
                productsCount ++;
            }
        }

        if (productsCount == 0) {
            return null;
        }

        String[] strings = new String[productsCount];
        int stringsIndex = 0;

        for(int i=0; i< products.length; i++) {
            if(products[i] != null) {
                strings[stringsIndex] = products[i].getName();
                stringsIndex ++;
            }
        }

        return strings;
    }

    public boolean isEqualsProductNum(int Num) {
        int productNum = 0;

        for (int i=0; i<products.length; i++) {
            if(products[i] != null) {
                productNum ++;
            }
        }

        if (productNum == Num) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name +"= "+ Arrays.toString(products);
    }
}
