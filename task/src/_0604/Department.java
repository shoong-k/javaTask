package _0604;

import java.util.Arrays;

//store 2개
public class Department {
    private String name;
    private Store[] stores = new Store[2];

    public Department(String name) {
        this.name = name;
    }

    //가게 생성하는 메서드
    public void makeStore(String name) {
        Store s = new Store(name);
        int index = findIndex();

        if (index == -1) {
            System.err.println("비어있는 공간이 없어요.");
            return;
        }

        stores[index] = s;
    }

    //비어있는 공간이 있는지 확인하는 메서드
    private int findIndex() {
        for (int i=0; i<stores.length; i++) {
            if (stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "";
        result = Arrays.toString(stores);
        return "이름은 " + name + "이고, 스토어는 " + result;
    }

    //가게에 물건 생성
    public void makeProduct (String storeName, String productName) {
        for (int i=0; i<stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }

            if(stores[i].isEqualStoreName(storeName)) {
                stores[i].makeProduct(productName);
                return;
            }
        }

        System.err.println("가게에 물건을 만들 수 없어요.");
    }

}


