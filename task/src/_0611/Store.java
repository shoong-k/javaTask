package _0611;

import java.util.Objects;

public class Store {
    private final String name;
    public Product[] products = new Product[3];

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean checkName(String name) {
        //가게이름이 일치하는지 확인한다.
        if (Objects.equals(this.name, name)) {
            return true;
        }
        //System.err.println("가게 이름이 달라요.");
        return false;
    }

    public void addProduct(String productName) {
        //스토어에 상품을 추가한다.
        int productsIndex = getProductsIndex();

        if (productsIndex == -1) {
            System.err.println("빈 공간이 없어서 저장할 수 없어요.");
            return;
        }
        products[productsIndex] = new Product(productName);
    }

    private int getProductsIndex() {
        //비어있는 프로덕트배열인덱스를 찾는 메서드
        for (int i=0; i<products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkProductNum(int productNum) {
        //int thisProductNum = 0;

        for (int i=0; i<products.length; i++) {
            if(products[i]!=null) {
                productNum --;
            }
        }

        return productNum == 0;
    }

    public String[] getProductsName() {
        String[] productsName = new String[products.length];

        for (int i = 0; i<products.length; i++) {
            productsName[i] = products[i].getProductName();
        }

        return productsName;
    }

    public boolean isExistProduct(String productName) {
        for (Product product : products) {
            if (product == null) {
                continue;
            }
            if (product.checkName(productName)) {
                return true;
            } // else에는 return이 없어도 되나? 되는거 같은데?
        }
        return false;
    }
}

