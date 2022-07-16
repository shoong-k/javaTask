package _0618;

import java.util.Objects;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public boolean isEqualsName(String productName) {
        return Objects.equals(productName, this.name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
