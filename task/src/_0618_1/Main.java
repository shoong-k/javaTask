package _0618_1;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");

        d.createStore("삼성");
        d.createStore("LG");
        d.createStore("애플");
        d.createStore("한화");

        d.createProduct("애플", "노트북");
        d.createProduct("애플", "패드");
        d.createProduct("애플", "휴대폰");
        d.createProduct("애플", "이어폰");
        d.createProduct("애플", "마우스");
    }
}
