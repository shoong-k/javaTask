package _0716;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");
        System.out.println(d);

        d.createStore("삼성");
        System.out.println(d);

        d.createStore("애플");
        System.out.println(d);

        d.createStore("LG");
        System.out.println(d);

        d.createStore("한화");
        System.out.println(d);

        d.createStore("두산");
        System.out.println(d);
    }
}
