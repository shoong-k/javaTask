package _0625_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEqualsName(String name) {
        return Objects.equals(name, this.name);
    }

    //상품만들기
    public void createProduct(String productName) {
        products.add(new Product(productName));
        System.out.println(this.name + "에 " + productName + "을 만들었습니다.");
    }

    @Override
    public String toString() {
        return this.name + products;
    }

    public boolean hasProductByName(String productName) {
        for (Product product: products) {
            if(product == null) {
                continue;
            }
            if(product.isEqualsName(productName)) {
                return true;
            }
        }
        return false;
    }
}
