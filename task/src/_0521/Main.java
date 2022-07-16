package _0521;

public class Main {
    public static void main(String[] args) {
        Department d1 = new Department("롯데");

        d1.addStore("삼성");
        d1.addStore("LG");
        d1.addStore("현대");

        d1.print();
        d1.addProduct("삼성","갤럭시");
        d1.addProduct("삼성","갤럭시1");
        d1.addProduct("삼성","갤럭시2");
        d1.addProduct("삼성","갤럭시3");

    }
}
