package _0430;

public class Main {
    public static void main(String[] args) {
        School school = new School("광교초등학교");

        Student[] studentInRoom1 = school.room1.students[];
        Student[] studentInRoom2 = school.room2.students[];


        school.room1.students[0].assignedStudentToRoom("슝", 30, 1);
    }
}
