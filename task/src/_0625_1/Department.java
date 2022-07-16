package _0625_1;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Store> stores = new ArrayList<>();
    //ArrayList가 자식이고 List가 부모역할

    public Department(String name) {
        this.name = name;
    }

    //가게 만들기
    public void createStore(String storeName) {
        stores.add(new Store(storeName));
        System.out.println(this.name + "에 " + storeName + "을 만들었습니다.");
    }

    //상품 만들기
    public void createProduct(String storeName, String productName) {
        //같은 이름의 가게가 있는지 확인하기
        //가게가 없으면 에러
        //가게가 있으면 생성

        Store store = findStoreByName(storeName); // -> null, store

        if(store == null) {
            System.err.println(storeName + "이 없어요. 이름을 다시 확인해주세요.");
            return;
        }

        store.createProduct(productName);
    }

    //같은 이름의 가게가 있는지 확인하기
    // for(String s: new String("", "")) {
    //     System.out.println(s);}
    private Store findStoreByName(String storeName) {
        for (Store store: stores) {
            if(store == null) {
                continue;
            }

            if(store.isEqualsName(storeName)) {
                return store;
            }
        }

        return null;
    }

    //특정 물건을 가지고 있는 가게명 리턴 //List
    public List<String> findStoreNamesByProductName(String productName) {
        //스토어 리스트를 돌면서 //프로덕트 가지고 있는지 확인
        //true -> 이름가져와서 //List에 추가
        //false -> 무시
        //nullPoint?
        List<String> storeNames = new ArrayList<>();

        for(Store store: stores) {
            if(store == null) {
                continue;
            }

            if(store.hasProductByName(productName)) {
                storeNames.add(store.getName());
            }
        }

        return storeNames;
    }


    @Override
    public String toString() {
        return this.name + stores;
    }
    //store가 가지고 있는 물건 리스트
    //store 이름으로 store찾기 //
    //물건리스트 출력하기


}

