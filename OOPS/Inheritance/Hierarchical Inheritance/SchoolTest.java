// Superclass
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher. Subject: " + subject);
    }
}

// Subclass Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student. Grade: " + grade);
    }
}

// Subclass Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member in " + department);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Math");
        Student s = new Student("Ravi", 15, "10th");
        Staff st = new Staff("Anil", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
