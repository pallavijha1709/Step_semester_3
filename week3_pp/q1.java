package week3_pp;

public class q1 {
    static class Student {
    String name;
    int marks;
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Divya";
        student.marks = 88;

        System.out.println("Name: " + student.name + " | Marks: " + student.marks);
    }
}
}
