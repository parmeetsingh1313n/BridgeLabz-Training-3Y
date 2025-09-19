import java.util.*;

class Course {
    String courseName;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String name) {
        this.schoolName = name;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School sch = new School("DPS");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Rajan");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        sch.addStudent(s1);
        sch.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        s1.showCourses();
        s2.showCourses();

        c1.showStudents();
        c2.showStudents();
    }
}
