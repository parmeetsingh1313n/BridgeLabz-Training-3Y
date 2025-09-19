class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;

    private final int rollNumber; // cant change
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber; // this keyword
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    void displayStudent() {
        if (this instanceof Student) {
            System.out.println("[" + universityName + "] Roll: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Parmeet", "A");
        Student s2 = new Student(102, "Aryan", "B");
        s1.displayStudent();
        s2.displayStudent();
        Student.displayTotalStudents();
    }
}
