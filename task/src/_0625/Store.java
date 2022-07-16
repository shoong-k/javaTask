package _0625;

import java.util.Arrays;
import java.util.Objects;

public class Store {
    private String name;
    private Product[] products = new Product[3];

    public Store(String name) {
        this.name = name;
    }

    public boolean isEqualsName(String name) {
        return Objects.equals(this.name, name);
    }

    public boolean isCreatedProduct(String productName) {
        //가게를 만들고 결과 리턴
        //가게를 만들 빈 공간 찾아서 만들기
        //없으면 에러

        int emptyProductIndex = findEmptyProductIndex();

        if(emptyProductIndex == -1) {
            return false;
        }

        products[emptyProductIndex] = new Product(productName);
        return true;
    }

    private int findEmptyProductIndex() {
        for(int i=0; i<products.length; i++) {
            if(products[i]==null) {
                return i;
            }
        }
        return -1;
    }

    public String[] getProductsList() {
        int countProducts = 0;

        for (int i=0; i<products.length; i++) {
            if(products[i] != null) {
               countProducts ++;
            }
        }

        if (countProducts == 0) {
            return null;
        }

        String[] productsList = new String[countProducts];
        int productIndex = 0;

        for(int i=0; i<products.length; i++) {
            if(products[i] != null) {
                productsList[productIndex] = products[i].getName();
                productIndex ++;
            }
        }

        return productsList;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEqualsProductCount(int productCount) {
        int thisProductCount = 0;

        for (int i=0; i<products.length; i++) {
            if(products[i] == null) {
               continue;
            }

            thisProductCount ++;
        }

        if(productCount == thisProductCount) {
            return true;
        } return false;
    }
}
