package _0618_1;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Store> stores = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    //가게만들기
    public void createStore(String name) {
        //빈 배열 찾기
        stores.add(new Store(name));
        System.out.println("스토어 " + name + "을 만들었어요.");
    }


    //제품만들기
    public void createProduct(String storeName, String productName) {
        //이름으로 가게 찾기
        Store store = findStoreByName(storeName);

        if(store == null) {
            System.err.println("가게 이름을 다시 확인해주세요. 입력하신 이름은 " + storeName + "입니다.");
            return;
        }

        //가게한테 제품 넘겨서 만들고 성공여부 알려주기
        boolean isCreated = store.createProduct(productName);

        if(isCreated) {
            System.out.println(storeName + "에 " + productName + "을 만들었습니다.");
        }

    }

    private Store findStoreByName(String name) {
        for (int i=0; i<stores.size(); i++) {

            if(stores.get(i) == null) {
                continue;
            }

            if(stores.get(i).isEqualsName(name)) {
                return stores.get(i);
            }
        }

        return null;
    }
}
