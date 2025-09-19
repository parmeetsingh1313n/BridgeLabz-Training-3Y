class Employee {
    static String companyName = "Capgemini";
    static int totalEmployees = 0;

    private final int id; // employee_id --> final
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    void displayEmployee() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", ID: " + id + ", Name: " + name + ", Role: " + designation);
        }
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Parmeet", "Developer");
        Employee e2 = new Employee(2, "Keshav", "Tester");
        e1.displayEmployee();
        e2.displayEmployee();
        Employee.displayTotalEmployees();
    }
}
