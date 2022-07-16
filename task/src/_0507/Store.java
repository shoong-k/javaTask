package _0507;

public class Store {
    String name;
    Product[] products = new Product[3];
    int productNum;

    Store(String name) {
        this.name = name;
        this.productNum = 0;
    }

    void addProduct(String name) {
        products[productNum] = new Product(name);
        productNum ++;
    }
}
