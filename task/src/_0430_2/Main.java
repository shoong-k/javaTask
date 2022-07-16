package _0430_2;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("쿠팡",3);

        shop.addCart("첫번째 카트");
        shop.addCart("두번째 카트");
        shop.addCart("세번째 카트");

        shop.printCart();

    }
}
