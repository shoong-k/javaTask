package _0625;

public class Department {
    private String name;
    private Store[] stores = new Store[4];

    public Department(String name) {
        this.name = name;
    }

    public void createStore(String storeName) {
        //빈배열 찾아서 스토어 객체 생성 후 해당 배열에 저장
        //빈공간 없으면 에러
        int emptyStoreIndex = findEmptyStoreIndex();

        if(emptyStoreIndex == -1) {
            System.err.println("department " + this.name + "에는, store가 입점할 공간이 없어요." );
            return;
        }

        stores[emptyStoreIndex] = new Store(storeName);
        System.out.println("department " + this.name + "에, store " + storeName + "이 입점했습니다.");
    }

    private int findEmptyStoreIndex() {
        for (int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void createProduct(String storeName, String productName) {
        //스토어 이름으로 스토어 찾기
        //있으면, 해당 스토어에 프로덕트 만들기
        //없으면, 에러

        Store store = findStoreByStoreName(storeName);

        if(store == null) {
            System.err.println("store를 찾을 수 없어요. 이름을 다시 확인해주세요. 입력하신 이름은 " + storeName + "입니다.");
            return;
        }

        boolean isCreatedProduct = store.isCreatedProduct(productName);

        if(isCreatedProduct) {
            System.out.println(storeName + "에 " + productName + " 을 만들었습니다.");
        } else {
            System.err.println(storeName + " 에 " + productName + "을 만들지 못했습니다.");
        }

    }

    private Store findStoreByStoreName(String storeName) {
        for (int i = 0; i<stores.length; i++) {
            if(stores[i] == null) {
                continue;
            }
            if(stores[i].isEqualsName(storeName)) {
                return stores[i];
            }
        }

        return null;
    }

    public String[] getProductsByStoreName(String storeName) {
        for(int i=0; i<stores.length;i++) {
            if(stores[i] == null) {
                continue;
            }

            if(stores[i].isEqualsName(storeName)) {
                return stores[i].getProductsList();
            }
        }
        System.err.println("가게 이름을 다시 확인해주세요.");
        return null;
    }

    public String[] findStoreByProductsCount(int productCount) {
        //count를 store한테 넘겨서 같으면, 아니면
        int stringLength = 0;

        for(int i=0; i< stores.length; i++) {
            if(stores[i] == null) {
                continue;
            }
            if(stores[i].isEqualsProductCount(productCount)) {
                stringLength ++;
            }
        }

        if(stringLength == 0) {
            System.err.println("product 갯수가 " + productCount + "인 store가 없습니다. 다시 확인해주세요.");
            return null;
        }

        String[] storesIsEqualsProductCount = new String[stringLength];
        int stringIndex = 0;

        for (int i=0; i < stores.length; i++) {
            if(stores[i].isEqualsProductCount(productCount)) {
                storesIsEqualsProductCount[stringIndex] = stores[i].getName();
                stringIndex ++;
            }
        }

        return storesIsEqualsProductCount;
    }

}
