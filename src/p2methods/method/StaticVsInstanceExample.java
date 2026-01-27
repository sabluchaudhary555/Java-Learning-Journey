package p2methods.method;

public class StaticVsInstanceExample {

    // INSTANCE VARIABLE - different for each object
    String studentName;
    int rollNumber;

    // STATIC VARIABLE - shared by all objects
    static String schoolName = "Sunshine Public School";
    static int totalStudents = 0;

    // CONSTRUCTOR
    public StaticVsInstanceExample(String name, int roll) {
        this.studentName = name;
        this.rollNumber = roll;
        totalStudents++; // Increment static counter
    }

    // 1. INSTANCE METHOD - needs object
    public void displayStudentInfo() {
        System.out.println("Student: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("School: " + schoolName); // Can access static
    }

    // 2. INSTANCE METHOD WITH CALCULATION
    public double calculatePercentage(int marksObtained, int totalMarks) {
        return (marksObtained * 100.0) / totalMarks;
    }

    // 3. STATIC METHOD - can be called without object
    public static void displaySchoolInfo() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
        // CANNOT access: studentName or rollNumber
    }

    // 4. STATIC UTILITY METHOD
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    // 5. STATIC METHOD FOR OBJECT CREATION (Factory Method)
    public static StaticVsInstanceExample createStudent(String name, int roll) {
        return new StaticVsInstanceExample(name, roll);
    }

    public static void main(String[] args) {
        // Using static methods WITHOUT object
        StaticVsInstanceExample.displaySchoolInfo();
        System.out.println("Is valid email? " + StaticVsInstanceExample.isValidEmail("test@email.com"));

        // Creating objects for instance methods
        StaticVsInstanceExample student1 = new StaticVsInstanceExample("Alice", 101);
        StaticVsInstanceExample student2 = StaticVsInstanceExample.createStudent("Bob", 102);

        // Using instance methods
        student1.displayStudentInfo();
        System.out.println("Percentage: " + student1.calculatePercentage(85, 100) + "%");

        student2.displayStudentInfo();

        // Static method shows updated count
        StaticVsInstanceExample.displaySchoolInfo();
    }
}