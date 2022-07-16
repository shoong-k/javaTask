package _0618;

import java.util.Arrays;

public class Department {
    private String name;
    private Store[] stores = new Store[4];

    public Department(String name) {
        this.name = name;
    }

    public void createStore(String name) {
        //빈스토어배열찾아서 넣기
        int emptyStoreIndex = findEmptyStoreIndex();

        if (emptyStoreIndex == -1) {
            System.err.println("Department에 Store를 생성할 빈 공간이 없습니다.");
            return;
        }

        stores[emptyStoreIndex] = new Store(name);
        System.out.println(name + " store를 만들었습니다.");
    }

    private int findEmptyStoreIndex() {
        for(int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void createProduct(String storeName, String productName) {
        Store store = findStoreByName(storeName);

        if (store == null) {
            System.err.println("가게 이름을 다시 확인해주세요. 입력하신 이름은 " + storeName + "입니다.");
            return;
        }

        store.createProduct(productName);
        System.out.println(storeName + "에 " + productName + "을 만들었습니다.");

    }

    private Store findStoreByName(String name) {
        for (int i=0; i< stores.length; i++) {

            if(stores[i] == null) {
                continue;
            }

            if (stores[i].isEqualsName(name)) {
               return stores[i];
            }
        }
        return null;
    }

    public String[] findStoreByProductName(String productName) {
        int storeCount = 0;

        for (int i=0; i<stores.length; i++) {

            if(stores[i] == null) {
                continue;
            }

            if(stores[i].isExistProduct(productName)) {
                storeCount ++;
                //return stores[i].getName();
            }
        }

        String[] strings = new String[storeCount];
        int stringIndex = 0;

        for (int i=0; i<stores.length; i++) {

            if(stores[i] == null) {
                continue;
            }

            if(stores[i].isExistProduct(productName)) {
                strings[stringIndex] = stores[i].getName();
                stringIndex ++;
            }
        }

        return strings;
    }

    public String[] findProductsByStoreName(String storeName) {

        for (int i = 0; i<stores.length; i++) {

            if(stores[i] == null) {
                continue;
            }

            if (stores[i].isEqualsName(storeName)) {
                return stores[i].getProducts();
            }
        }

        return null;
    }

    public String[] findStoreByProductNum(int productNum) {
        int storeNum = 0;

        for (int i = 0; i<stores.length; i++) {

            if(stores[i] == null) {
                continue;
            }

            if(stores[i].isEqualsProductNum(productNum)) {
                storeNum ++;
            }
        }

        String[] strings = new String[storeNum];
        int stringNum = 0;

        for (int i = 0; i<stores.length; i++) {

            if(stores[i] == null) {
                continue;
            }

            if(stores[i].isEqualsProductNum(productNum)) {
                strings[stringNum] = stores[i].getName();
                stringNum ++;
            }
        }

        return strings;
    }

    @Override
    public String toString() {
        String s = "가게 이름은," + this.name + "입니다.";
        s += Arrays.toString(stores);
        return s;
    }

}
