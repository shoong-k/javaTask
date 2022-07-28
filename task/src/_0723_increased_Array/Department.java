package _0723_increased_Array;

//        - Department 에서 가게 생성하기
//        - Department 에서 물건 생성하기

public class Department {
    private String name;
    private Store[] stores = new Store[2];

    public Department(String name) {
        this.name = name;
        System.out.println(this.name + " department가 생성되었습니다.");
    }

    public void createStore(String name) {
        int storeIndex = storeIndex();

        if(storeIndex == -1) {
            Store[] newStores = new Store[stores.length * 2];
            for (int i=0; i<stores.length; i++) {
                newStores[i] = stores[i];
            }

            newStores[stores.length] = new Store(name);

            stores = newStores;

        } else {
            stores[storeIndex] = new Store(name);
        }

    }

    private int storeIndex() {
        for(int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void createProduct(String storeName, String productName) {
        Store store = IsEqualsByStoreName(storeName);

        if(store == null) {
            System.err.println(storeName + " 이름의 가게는 없어요. 다시 한번 확인해주세요.");
        } else {
            store.createProduct(productName);
        }
    }

    private Store IsEqualsByStoreName(String storeName) {
        for(int i=0; i<stores.length; i++) {
            if(stores[i]==null) {
                continue;
            }
            if(stores[i].isEquals(storeName)) {
                return stores[i];
            }
        }

        return null;
    }

    public int sizeOfStoreArray() {
        int sizeOfStoreArray = stores.length;
        return sizeOfStoreArray;
    }
}
