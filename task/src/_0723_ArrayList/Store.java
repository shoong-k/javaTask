package _0723_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
        System.out.println(this.name + " 가게가 생성되었습니다.");
    }

    public boolean isEquals(String name) {
        return Objects.equals(this.name, name);
    }

    public void createProduct(String productName) {
        products.add(new Product(productName));
    }

}
