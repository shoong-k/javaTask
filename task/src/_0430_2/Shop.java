package _0430_2;

public class Shop {
    String name;
    Cart[] carts;

    int cartNum = 0;

    Shop(String name, int cartCount){
        this.name = name;
        this.carts = new Cart[cartCount];

//        Cart[] carts = new Cart[cartCount];
//        this.carts = carts;
    }

    void setCart(int cartNumber, String cartName){
        carts[cartNumber] = new Cart(cartName);
    }

    void addCart(String cartName) {
        Cart cart = new Cart(cartName);

        this.carts[cartNum] = cart;
        this.cartNum = this.cartNum + 1;

        if (cartNum == carts.length) {
            System.out.println("카트가 부족해요.");
        } else {
            System.out.println("카트가 남아있어요.");
        }
    }

    void printCart(){
        for(int i=0; i<carts.length; i++) {
            carts[i].printCart();
        }
    }
}
