package _0723_increased_Array;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("롯데");
        d.createProduct("삼성", "마우스");

        d.createStore("삼성");
        d.createProduct("삼성", "마우스");
        d.createProduct("삼성", "노트북");

        d.createStore("LG");
        d.createProduct("LG", "마우스");
        d.createProduct("LG", "노트북");

        System.out.println(d.sizeOfStoreArray());

        d.createProduct("삼성", "이어폰");
        System.out.println(d.sizeOfStoreArray());

        d.createProduct("한화", "키보드");
        }
    }
