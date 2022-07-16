package _0514;

public class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    String printProduct() {
        String a = "상품은, " + this.name + " 입니다.";
        return a;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
