package _0521;

public class Store {
    private String name;
    private Product[] products = new Product[3];
    private int productNum =0;

    public Store(String name) {
        this.name = name;
    }

    public void addStore(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addProduct(String name) {
        if (this.productNum >= products.length) {
            System.err.println(name + " 상품을 진열할 공간이 없어요.");
            return;
        }
        Product product = new Product(name);
        this.products[this.productNum] = product;
        this.productNum ++;
    }

}
