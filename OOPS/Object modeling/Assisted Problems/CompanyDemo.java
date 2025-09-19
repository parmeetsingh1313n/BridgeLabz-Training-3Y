import java.util.*;

// Employee class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void showEmployee() {
        System.out.println("Employee: " + name);
    }
}

// Department class
class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

// Company class (Composition)
class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDept();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company c = new Company("TechSoft");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Ravi"));
        d1.addEmployee(new Employee("Parmeet"));

        d2.addEmployee(new Employee("Karan"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showCompany();
    }
}
