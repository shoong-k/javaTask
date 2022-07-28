package _0716;

public class Department {
    //2배씩 확장되는 배열
    private String name;
    private Store[] stores = new Store[1];

    public Department(String name) {
        this.name = name;
    }

    // 배열에 공간이 있는지 확인하고, 있으면 넣고,
    // 없으면 배열을 새로 생성해서 기존 데이터를 옮기고 새로 만든거에 넣기
    public void createStore(String name) {
        int indexOfStores = indexOfStores(); //0

        if (indexOfStores != -1) {
            Store store = new Store(name);
            stores[indexOfStores] = store;
            return;
        }

        //배열의 크기 *2
        //store 크기만큼 돌면서 가져오기
        Store[] newStores = new Store[stores.length * 2]; //2
        for (int i = 0; i < stores.length; i++) {
            newStores[i] = stores[i];
        }

        int indexOfNewStores = stores.length;

        Store store = new Store(name);
        newStores[indexOfNewStores] = store;

        stores = newStores;
    }

    //배열을 키워야할지 말아야 할지
    private boolean isEmpty() {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                return true;
            }
        }
        return false;
    }

    //배열의 위치
    private int indexOfStores() {
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String arrayInfoFront = "[";
        String arrayInfoEnd = "]";

        for (int i=0; i<stores.length; i++) {

            if(stores[i] == null) {
                arrayInfoFront += "empty";

                if (i < stores.length - 1) {
                    arrayInfoFront += ", ";
                }

                continue;
            }

            String storeName = stores[i].getName();
            arrayInfoFront += storeName;

            if ( i < stores.length - 1) {
                arrayInfoFront += ", ";
            }
        }
        arrayInfoFront += arrayInfoEnd;
        return arrayInfoFront;
    }

}
