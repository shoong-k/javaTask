package _0723;
//배열증가
//배열 이쁘게 찍기
public class Department {
    private String name;
    private Store[] stores = new Store[1];

    public Department(String name) {
        this.name = name;
        System.out.println(this.name + " department 를 만들었습니다.");
    }

}
