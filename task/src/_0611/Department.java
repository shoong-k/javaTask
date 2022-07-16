package _0611;

import java.util.Arrays;

public class Department {
    private String name;
    public Store[] stores = new Store[2];

    public Department(String name) {
        this.name = name;
        System.out.println(this.name + " 백화점을 만들었습니다.");
    }

//    public void addStore(String storeName) {
//        // 배열이 있는지 확인한다.
//        // 있으면, 이미 스토어가 두개가 넘었는지 체크한다.
//        if (stores == null) {
//            System.err.println("스토어 배열이 없어서, 스토어를 만들 수 없어요.");
//            break;
//        }
//
//        for (int i =0; i<stores.length; i++) {
//            if (stores[i] == null) {
//                //Store store = new Store(storeName);
//                //stores[i] = store;
//                stores[i] = new Store(storeName);
//                return;
//            }
//            System.err.println("스토어 인스턴스가 부족해서, 스토어를 만들 수 없어요.");
//        }
//    }

    public void addStore(String storeName) {
        //가게를 생성한다.
        int storeIndex = getStoreIndex();

        if (storeIndex == -1) {
            System.err.println("스토어 배열이 꽉 차서," + storeName + "스토어를 만들 수 없어요.");
            return;  //break가 아니라 return...
        }

//        Store newStore = new Store(storeName);
//        stores[storeIndex] = newStore;
        stores[storeIndex] = new Store(storeName);
        System.out.println(storeName + " 스토어를 만들었습니다.");
    }

    private int getStoreIndex() {
        //비어있는 배열넘버를 찾는다.
        for (int i=0; i<stores.length; i++) {
//            if (stores == null) {   //스토어 배열이 비었는지? 널포인트에러?
//                System.err.println("스토어 배열이 없어요.");
//                break;
//            }
            if (stores[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private int findStoreIndex(String storeName) {
        //가게이름으로 배열인덱스를 찾는다.
        for (int i=0; i<stores.length; i++) {
            if (stores[i].checkName(storeName))
                return i;
        }
        return -1;
    }

    public void addProduct (String storeName, String productName) {
        //물건을 생성한다.
//        for (int i = 0; i < stores.length; i ++) {
//            if(stores[i] == null) {
//                System.err.println("객체가 비어있어요.");
//                return; //리턴 맞나?
//            }
//            if(!(stores[i].getName()).equals(storeName)) {
//                System.err.println("그런 가게가 없어요.");
//                return; //리턴 맞나?
//            }
//
//            stores[i].addProduct(productName);
//        }

        int storesIndex = findStoreIndex(storeName);

        if (storesIndex == -1) {
            System.err.println(productName + "을 추가할 수 없습니다. 입력하신 가게이름 -" + storeName + "- 이 정확한지 확인해주세요.");
            return;
        }

        stores[storesIndex].addProduct(productName);
        System.out.println(productName + "을 " + storeName + "에 추가했습니다.");
    }

    public String[] getProductsNameInTheStore(String storeName) {
        //특정 스토어에 있는 상품리스트 메서드
        //x 스토어 클래스에, 프로덕트 배열크기 확인하는 메서드를 만들어야 하고 -> products.length 쓰면 되는데
        //v 스토어 클래스에, 배열크기만큼 for문 돌면서 프로덕트이름 가져오는 메서드 만들어야 하고 -> 가져와서 배열에 넣어서 리턴해주는 메서드
        //v 프로덕트 클래스에, 이름 주는 메서드 만들어야 함
        //? 배열에 넣어야 하는데? 어떻게 넣는지 모르겠다?
        return stores[findStoreIndex(storeName)].getProductsName();
    }

    public String[] findStoreHasProduct (String productName) {
        //특정 물건이 어떤 가게에 있는지 출력하기, 여러개일 수도 있으니까 배열로 리턴하자
        //가게를 for문으로 돌면서 상품여부 확인하는 메서드 호출 -> 상품이 있으면 스토어 이름을 배열에 넣어 -> 리턴해
        //store클래스에 for문으로 돌면서 product 이름이 같은지 체크하는 메서드 호출해서 결과를 주는 메서드 생성 -> isExistProduct
        //v product클래스에 이름이 같은지 체크하는 메서드 생성 -> checkName
        String[] hasProduct = new String[stores.length];

        for (int i=0; i<stores.length; i++) {
            if(stores[i].isExistProduct(productName) == true) {
                hasProduct[i] = stores[i].getName(); //배열에 넣어
            } //배열을 비워둬
        }  return hasProduct;//배열을 리턴해
    }

    public String[] findStoresByProductNum (int productNum) {
        String[] findStoresByProductNum = new String[stores.length];
        int stringNum = 0;

        for (int i = 0; i < stores.length; i++) {
            if (stores[i].checkProductNum(productNum)) {
                //findStoresByProductNum[stringNum] = new String();
                findStoresByProductNum[stringNum] = stores[i].getName();

                stringNum ++;
            }
        }

        //비어있지 않은 수 확인
        int count = 0;

        for (int i = 0; i<findStoresByProductNum.length; i++) {
            if (findStoresByProductNum[i] != null) {
                count ++;
            }
        }

        String[] returnStoresByProductNum = new String[count];
        int nextIndex = 0;

        for (int i = 0; i < findStoresByProductNum.length; i++) {
            if (findStoresByProductNum[i] != null ) {
                returnStoresByProductNum[nextIndex] = findStoresByProductNum[i];
                nextIndex ++;
            }
        }

        return returnStoresByProductNum;
    }
}
