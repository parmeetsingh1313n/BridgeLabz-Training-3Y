// Base class Employee
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Manages team of size: " + teamSize);
    }
}

// Developer subclass
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Intern subclass
class Intern extends Employee {
    String duration;

    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager("Ravi", 101, 50000, 5);
        Employee e2 = new Developer("Ankit", 102, 40000, "Java");
        Employee e3 = new Intern("Anshu", 103, 15000, "6 months");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
