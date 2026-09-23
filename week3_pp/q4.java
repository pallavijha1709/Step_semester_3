package week3_pp;

public class q4 {
    static class Course {
    String code;
    String title;

    Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {

        Course course = new Course("21CSC201J", "Data Structures");

        System.out.println(course.code + " - " + course.title);
    }
}
}
