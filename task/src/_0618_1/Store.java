package _0618_1;

import java.util.Objects;

public class Store {
    private String name;
    private Product[] products = new Product[4];

    public Store(String name) {
        this.name = name;
    }

    public boolean isEqualsName(String name) {
        return Objects.equals(this.name, name);
    }

    public boolean createProduct(String productName) {
        //제품 만들고 // 성공여부 알려주기
        //빈 배열 찾아서 만들기

        int emptyProductIndex = findEmptyProductIndex();

        if(emptyProductIndex == -1) {
            System.err.println(productName + "을 만들 공간이 " + this.name + "에 없어요.");
            return false;
        }

        products[emptyProductIndex] = new Product(productName);
        return true;
    }

    private int findEmptyProductIndex() {
        for (int i=0; i<products.length; i++) {
            if(products[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
