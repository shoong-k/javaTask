package _0430;

public class Main {
    static Student[] studentInRoom1, studentInRoom2;
    static Room room1, room2;

    public static void main(String[] args) {
        School school = new School("광교초등학교");

        room1 = school.room1;
        room2 = school.room2;
        studentInRoom1 = school.room1.students;
        studentInRoom2 = school.room2.students;

        room1.setRoom("햇살반", 1, 1);
        studentInRoom1[0].assignedStudentToRoom("슝", 30, 1);
        studentInRoom1[1].assignedStudentToRoom("경수", 31,2);
        studentInRoom1[2].assignedStudentToRoom("쵸미", 32,3);
        studentInRoom1[3].assignedStudentToRoom("썬",33,4);
        studentInRoom1[4].assignedStudentToRoom("클린트", 34,5);

        room2.setRoom("산새반",2,2);
        studentInRoom2[0].assignedStudentToRoom("새라", 35,1);
        studentInRoom2[1].assignedStudentToRoom("레드", 36, 2);
        studentInRoom2[2].assignedStudentToRoom("저스틴",37,3);
        studentInRoom2[3].assignedStudentToRoom("카일로", 38,4);
        studentInRoom2[4].assignedStudentToRoom("딜레", 39,5);

        //첫 번째 Room&&세번째 Student - School에서 Room을 참조하고 Student을 참조하여 정보를 출력해주세요.
        System.out.println(school.room1.students[2].name + " , " + room1.students[2].grade + " , " + studentInRoom1[2].grade);

        //두 번째 Room&&모든 Student - School에서 Room을 참조하고 Student의 메서드를 사용하여 출력해주세요.
        for (int i = 0; i < studentInRoom2.length; i++) {
            school.room2.students[i].getStudent();
        }

        //두 번째 Room&&모든 Student - School에서 Room을 참조하고 room의 메서드를 사용하여 출력해주세요.
        for (int i = 0; i< studentInRoom2.length; i++) {
            school.room2.getStudentInRoom(i);
        }

        //School에 있는 모든 Student - School에서 Room의 메서드를 사용하여 출력해주세요.


        //School에 있는 모든 Student - School의 메서드를 사용하여 출력해주세요.
        school.getAllStudentsInSchool();
    }
}
