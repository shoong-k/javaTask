package _0706;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department implements NameGettable{
    private String name;
    private List<Store> stores = new ArrayList<>();
    //private List<Store> member = new ArrayList<>();
    //private Queue<Store> stores = new LinkedList<>(); //add못씀

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void createStore(String name) {
        //자료형 변수명 = 실질데이터;
        //int a = 1;
        //Store s = new Store(name);
        //Store s = new Store(name);
        stores.add(new Store(name));
        //Store s = stores.get(0);
    }

    public void createProduct(String storeName, String productName) {

        Store s = findStoreOrNullByName(storeName);

        if (s == null) {
            System.err.println("그런 가게 없음");
            return;
        }

        s.createProduct(productName);
    }

    private Store findStoreOrNullByName(String name) {
        if (stores == null) {
            return null;
        }

        for(int i = 0; i < stores.size(); i++) {
            Store s = stores.get(i);

            if (s == null) {
                continue;
            }

            boolean b = s.isEquals(name);

            if(b) {
                return s;
            }
        }
        return null;
    }

    //물건이름으로 스토어이름
    public List<String> findStoreNamesByProductName(String productName) {
        List<String> storeNames = new ArrayList<>();

        for (int i = 0; i<stores.size(); i++) {
            Store s = stores.get(i);

            if(s==null) {
                continue;
            }

            boolean b = s.hasProduct(productName);

            if(b) {
                String storeName = s.getName();
                storeNames.add(storeName);
            }
        }
        return storeNames;
    }
}
