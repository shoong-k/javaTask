package _0521;

import java.util.Arrays;

public class Department {
    private String name;
    private Store[] stores = new Store[2];
    private int storeNum = 0;

    public Department(String name) {
        this.name = name;
    }

    ///가게생성
    public void addStore(String storeName) {
        if(storeNum>=stores.length) {
            System.err.println("입주할 공간이 없어요.");
            return; //for문 안탐
        }
        Store s1 = new Store(storeName);
        stores[storeNum] = s1;
        storeNum ++;
    }

    public void print() {
        System.out.println(Arrays.toString(stores));
    }

    ///가게 찾기
    public int findStoreIndex(String storeName) {
        for(int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                continue;
            }
            if(!stores[i].getName().equals(storeName)) {
                continue;
            }
           return i;
        }
        return -1;
    }

    ///물건생성
    public void addProduct(String storeName, String productName) {
        int storeIndex = findStoreIndex(storeName);

        if (storeIndex==-1) {
            System.err.println("입점하지 않은 가게에요. 다시 확인해주세요.");
            return;
        }
        stores[storeIndex].addProduct(productName);
    }

    ///특정가게에 어떤 물건있는지 출력


    ///특정 물건의 개수를 만족하는 가게이름 출력

    ///물건 검색하여 가게 출력
}
