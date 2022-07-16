package _0514;

import java.util.ArrayList;

public class Department {
    String name;
    Store[] stores = new Store[3];
    ArrayList<Store> stores2 = new ArrayList<>();
    int storeNum = 0;

    Department(String name) {
        this.name = name;
    }

    void addStore(String name) {
        if(storeNum >= stores.length) {
            return;
        }

        stores[storeNum] = new Store(name);
        storeNum ++;
    }

    void addStore2(String name) {
        stores2.add(new Store(name));
    }

    void addProduct(String storeName, String productName) {
        for (int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                continue;
            }
            if(!stores[i].name.equals(storeName)) {
                continue;
            }
            stores[i].addProduct(productName);
            return;
        }
    }

    void addProduct2(String storeName, String productName) {
        for (int i=0; i<stores2.size();i++) {
            Store store = stores2.get(i);

            if(!store.name.equals(storeName)) {
                continue;
            }

            store.addProduct(productName);
        }
    }

    void printProducts(String storeName) {
        for (int i = 0; i<stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            if (!stores[i].name.equals(storeName)) {
                continue;
            }
            stores[i].printProducts();
        }
    }

    void printProduct(String productName) {
        //store를 돌면서 받은 상품이 있는지 확인해서, store랑 상품이름 줘
        boolean hasAnyProduct = false;

        for (int i = 0; i<stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            //stores[i].name, productName 프린트해줘 //true, false
            boolean hasProduct = stores[i].hasProduct(productName);
            if (hasProduct) {
                System.out.println(productName + "은/는 " + stores[i].name + "에 있어요.");
                hasAnyProduct = true;
            }
            //상품이 없어
            //continue; 아래 코드 없으니까 안써도 됨
//            for (int j = 0; j < stores[i].products.length; j++ ){
//                if(!stores[i].products[j].name.equals(productName)) {
//                    continue;
//                }
//            }
        }

        if(!hasAnyProduct) {
            System.out.println("그런 상품은 없어요. 다시 확인해주세요.");
        }
    }

}
