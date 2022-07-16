package _0706;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store implements NameGettable{
    private String name;
    private List<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public void createProduct(String name) {
        products.add(new Product(name));
    }

    public boolean isEquals(String name) {
        return Objects.equals(name, this.name);
    }

    public boolean hasProduct(String productName) {
        for (int i = 0; i< products.size(); i++) {
            Product p = products.get(i);

            if (p == null) {
                continue;
            }

            boolean b = p.isEqualsName(productName);

            if (b) {
                return b;
            }

        }

        return false;
    }

    public String getName() {
        return this.name;
    }
}
