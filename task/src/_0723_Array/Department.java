package _0723_Array;
//        - Department 에서 가게 생성하기
//        - Department 에서 물건 생성하기
public class Department {
    private String name;
    private Store[] stores = new Store[2];

    Department(String name) {
        this.name = name;
    }

    //가게 생성하기
    public void createStore(String name) {
        int storeIndex = storeIndex();

        if(storeIndex==-1) {
            System.err.println("공간이 없습니다.");
        }

        stores[storeIndex] = new Store(name); //객체 생성
    }

    //가게 생성할 공간 있는지 체크
    private int storeIndex() {
        for(int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    //물건 생성하기
    public void createProduct(String storeName, String productName) {
        Store store = findStoreByStoreName(storeName);

        if(store == null) {
            System.err.println("'" + storeName + "' 스토어는 없습니다. 이름을 다시 확인해주세요.");
        } else {
            store.createProduct(productName);
        }
    }

    //가게이름으로 가게 찾기
    private Store findStoreByStoreName(String storeName) {
        for(int i=0; i<stores.length; i++) {
            if(stores[i]==null) {
                continue;    //왜 컨티뉴?
            }
            if(stores[i].isEqualsName(storeName)) {
                return stores[i];
            }
        }
        return null;
    }

}
