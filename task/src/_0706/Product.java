package _0706;

import java.util.Objects;

public class Product implements NameGettable{
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public boolean isEqualsName(String name) {
        return Objects.equals(name, this.name);
    }

    public String getName() {
        return this.name;
    }
}
