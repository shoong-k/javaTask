package _0611;

import java.util.Objects;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getProductName() {
        return this.name;
    }

    public Product addProduct(String name) {
        Product product = null;
        product.name = name;
        return product;
    }

    public boolean checkName(String name) {
        return Objects.equals(this.name, name);
    }
}
