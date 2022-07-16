package _0611_1;

import java.util.Arrays;
import java.util.Objects;

public class Store {
    private final String name;
    private final Product[] products = new Product[3];

    public Store(String name) {
        this.name = name;
    }

    public boolean isEqualsName(String name) {
        return Objects.equals(this.name, name);
    }

    public String getName() {
        return this.name;
    }

    //프로덕트를 만드는데, 찾은 위치에 넣는다.
    public void createProduct(String productName) {
        int emptyProductIndex = findProductEmptyIndex();

        if (emptyProductIndex == -1) {
            System.err.println(this.name + "에는 빈 프로덕트 공간이 없어서 넣을 수 없어요.");
            return;
        }

        Product product = new Product(productName);
        products[emptyProductIndex] = product;
    }

    //어디에 넣을지 찾는다.
    private int findProductEmptyIndex() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return this.name +"= "+ Arrays.toString(products);
    }

    //스토어 메서드한테 넘겨서 있으면 true, 없으면 false로
    //프로덕트 한테 넘겨서 받아오기 // isEqualsName
    public boolean isExistProductByName(String productName) {
        for (int i = 0; i < products.length; i++) {
            if(products[i] == null) {
                continue;
            }
            if(products[i].isEqualsName(productName)) {
                return true;
            }
        }
        return false;
    }

}
