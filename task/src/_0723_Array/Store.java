package _0723_Array;

import java.util.Objects;

public class Store {
    private String name;
    private Product[] products = new Product[2];

    Store(String name) {
        this.name = name;
        System.out.println(this.name + " 스토어가 생성되었습니다.");
    }

    public boolean isEqualsName(String storeName) {
        return Objects.equals(storeName,this.name);
    }

    public void createProduct(String productName) {
        int productIndex = productIndex();

        if(productIndex == -1) {
            System.err.println("공간이 없습니다.");
        } else {
            products[productIndex] = new Product(productName);        //else안으로 들어가야함
        }
    }

    //넣을 공간이 있는지 확인
    private int productIndex() {
        for(int i=0; i<products.length; i++) {
            if(products[i]==null) {
                return i; //리턴하면 끝나는건가?
            }
        }

        return -1;
    }
}
