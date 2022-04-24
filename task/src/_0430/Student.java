package _0430;

public class Student {
    String name = "홍길동";
    int age = 10;
    int grade = 1;

    Student() {};

    Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void assignedStudentToRoom(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void getStudent() {
        System.out.println(this.name + " , " +  this.age + " , " + this.grade);
    }

}
