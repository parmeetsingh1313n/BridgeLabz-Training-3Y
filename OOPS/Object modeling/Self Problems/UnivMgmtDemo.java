import java.util.*;

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    Course(String name) {
        this.courseName = name;
        students = new ArrayList<>();
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }

    void enrollStudent(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        c.enrollStudent(this);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

public class UnivMgmtDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        Student s2 = new Student("Parmeet Singh");

        Professor p1 = new Professor("Dr. Rai");

        Course c1 = new Course("OOPs");
        c1.assignProfessor(p1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
    }
}
