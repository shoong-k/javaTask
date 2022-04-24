package _0430;

public class Room {
    String name = "default";
    int roomNumber = 1;
    int roomFloor = 1;
    Student[] students = new Student[5];

    Room(){}

    void makeRoom(String name, int roomNumber, int roomFloor) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.roomFloor = roomFloor;

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
    }
}
