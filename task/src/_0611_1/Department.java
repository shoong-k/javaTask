package _0611_1;

import java.util.Arrays;

public class Department {
    private final String name;
    private final Store[] stores = new Store[2];

    public Department(String name) {
        this.name = name;
    }

    public void addStore(String storeName) {
        //가게 생성하기
        //비어있는 인덱스찾기 findStoreIndex()
        //store 메서드 호출해서, 인덱스에 넣기
        final int storeIndex = findStoreIndex();

        if (storeIndex == -1) {
            System.err.println("스토어 배열이 꽉 차서 가게를 만들 수 없어요.");
            return;
        }

        stores[storeIndex] = new Store(storeName);
    }

    private int findStoreIndex() {
        for (int i = 0; i<stores.length; i++) {
            if (stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String s = "가게 이름은," + this.name + "입니다.";
        s += Arrays.toString(stores);
        return s;
    }

    public void addProduct(String storeName, String productName) {
        //특정 스토어에 특정 물건 생성하기
        //스토어 이름으로 스토어 찾기
          //이름 스토어한테 넘겨서 boolean으로 받아야 함
       //스토어.프로덕트생성메서드호출 //프로덕트 만들 수 있는지 크기 체크
        //ㄴ 프로덕트 생성자 호출
        //continue, break : for문 안에서

        Store s = findStoreByStoreName(storeName);

        if (s == null) {
            System.err.println(storeName + "이 맞는지 확인해주세요.");
            return;
        }

        s.createProduct(productName);
    }

    private Store findStoreByStoreName(String storeName) {
        for (int i=0; i<stores.length; i++) {
            if (stores[i].isEqualsName(storeName)) {
                return stores[i];
            }
        }
        return null;
    }

    public String[] findStoreByProduct(String productName) {
        //스토어를 돌면서, 상품이 있는지 확인
        //상품이름을 스토어 메서드한테 넘겨서 있으면 true, 없으면 false로
        //true면 새로운 배열에 넣어주기

        int countStore = 0;

        for (int i=0; i < stores.length; i++) {
            if (stores[i].isExistProductByName(productName)) {
                countStore ++;
                //stores[i].getName();
            }
        }

        String[] strings = new String[countStore];
        int stringsNum =0;

        for (int i=0; i < stores.length; i++) {
            if (stores[i].isExistProductByName(productName)) {
                strings[stringsNum] = stores[i].getName();
                stringsNum ++;
            }
        }

        return strings;
    }

}
