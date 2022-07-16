package _0507;

public class Department {
    String name;
    Store[] stores = new Store[3];
    int storeNum;

    Department(String name) {
        this.name = name;
        storeNum = 0;
    }

    void addStore(String name) {
        stores[storeNum] = new Store(name);
        storeNum ++;
    }

    void addProduct(String storeName, String productName) {
//        int pickedStoreNum = -1;
        for (int i = 0; i < stores.length; i++) {

            if(stores[i] == null) {
                continue;
            }

            if(!stores[i].name.equals(storeName)) {
                continue;
            }

            stores[i].addProduct(productName);
            break;
        }
    }
}