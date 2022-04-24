package _0430;

public class School {
    String name = "판교초등학교";
    Room room1 = new Room();
    Room room2 = new Room();

    School(String name){
        this.name = name;
        System.out.println("[School] 생성자가 호출되었습니다." + this.name);
    }
}
