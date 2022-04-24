package _0430;

public class School {
    String name = "판교초등학교";
    Room room1 = new Room();
    Room room2 = new Room();

    School(String name){
        this.name = name;
        System.out.println("[School] 생성자가 호출되었습니다." + this.name);
    }

    void getAllStudentsInSchool(){
        for (int i = 0; i < room1.students.length; i++) {
            room1.getStudentInRoom(i);
        }

        for (int i = 0; i < room2.students.length; i++) {
            room2.getStudentInRoom(i);
        }
    }
}
