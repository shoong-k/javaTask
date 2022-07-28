package _0716;

public class Store {
    private String name;
    private Product[] products = new Product[1];

    public Store(String name) {
        this.name = name;
        System.out.println(this.name + "스토어를 만들었습니다.");
    }

    //option + enter
    public String getName() {
        return this.name;
    }

}
