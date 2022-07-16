package _0625_1;

import java.util.Objects;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return this.name;
    }

    public boolean isEqualsName(String productName) {
        return Objects.equals(this.name, productName);
    }
}
