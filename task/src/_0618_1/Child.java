package _0618_1;

public class Child extends Parent {
    public void printChild() {
        System.out.println("hello world, child.");
    }

    @Override
    public void print() {
        printChild();
    }
}
