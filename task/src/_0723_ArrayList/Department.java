package _0723_ArrayList;
//        - Department 에서 가게 생성하기
//        - Department 에서 물건 생성하기

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Store> stores = new ArrayList<>();

    public Department(String name) {
        this.name = name;
        System.out.println(this.name + " Department가 생성되었습니다.");
    }

    public void createStore(String storeName) {
        stores.add(new Store(storeName));
    }

    public void createProduct(String storeName, String productName) {
        Store store = findStoreOrNullByName(storeName);

        if(store == null) {
            System.err.println(storeName + " 이 없습니다. 이름을 다시 확인해주세요.");
        } else {
            store.createProduct(productName);
        }
    }

    private Store findStoreOrNullByName(String storeName) {
        if(stores == null) {
            return null;
        }

        for(int i=0; i<stores.size(); i++) {
            Store store = stores.get(i);

            if(store == null) {
                continue;
            }

            boolean isEquals = store.isEquals(storeName);

            if(isEquals) {
                return store;
            }
        }

        return null;
    }
}
