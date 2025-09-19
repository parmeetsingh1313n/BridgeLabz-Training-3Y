import java.util.*;

// Faculty can exist independently
class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

// Department belongs to University
class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}

class University {
    String name;
    ArrayList<Department> departments;
    ArrayList<Faculty> faculties;

    University(String name) {
        this.name = name;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println(d.deptName);
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println(f.name);
        }
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        University u = new University("GLA University");

        Department d1 = new Department("CSE");
        Department d2 = new Department("EEE");

        Faculty f1 = new Faculty("Dr. Gupta");
        Faculty f2 = new Faculty("Prof. Rai");

        u.addDepartment(d1);
        u.addDepartment(d2);

        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showUniversity();
    }
}
