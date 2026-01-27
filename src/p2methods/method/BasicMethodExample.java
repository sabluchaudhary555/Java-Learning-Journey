package p2methods.method;

public class BasicMethodExample {


    // 1. SIMPLE VOID METHOD
    public static void greet() {
        System.out.println("Hello from a basic method!");
    }

    // 2. METHOD WITH RETURN VALUE
    public static int getNumber() {
        return 42;
    }

    // 3. METHOD WITH ONE PARAMETER
    public static void printSquare(int num) {
        int square = num * num;
        System.out.println("Square of " + num + " is " + square);
    }

    // 4. METHOD WITH MULTIPLE PARAMETERS
    public static int add(int a, int b) {
        return a + b;
    }

    // 5. METHOD WITH STRING PARAMETERS
    public static String createEmail(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }

    // MAIN METHOD TO TEST
    public static void main(String[] args) {
        greet();
        System.out.println("Number: " + getNumber());
        printSquare(5);
        System.out.println("Sum: " + add(10, 20));
        System.out.println("Email: " + createEmail("hacker", "cracker"));
    }
}