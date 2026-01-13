package p2methods.fntion;


public class Methods {

    // ==============================================================
    // 📌 1. SIMPLE VOID METHOD (No Return Value)
    // ==============================================================

    // Method definition: 'public' means accessible from anywhere
    // 'static' means belongs to class, not objects
    // 'void' means returns nothing
    public static void greetUser() {
        System.out.println("Hello! Welcome to Java Methods.");
        System.out.println("This method just prints messages.");
    }

    // ==============================================================
    // 📌 2. METHOD WITH PARAMETERS
    // ==============================================================

    // Method that takes parameters (inputs)
    // 'String name' - parameter of type String
    public static void sayHello(String name) {
        // Concatenation: joining strings with +
        System.out.println("Hello, " + name + "!");
    }

    // Method with multiple parameters
    public static void introduce(String name, int age, String city) {
        System.out.println(name + " is " + age + " years old and lives in " + city);
    }

    // ==============================================================
    // 📌 3. METHOD WITH RETURN VALUE
    // ==============================================================

    // Method that returns an integer
    // 'int' before method name = return type
    public static int addNumbers(int a, int b) {
        int result = a + b;  // Calculate sum
        return result;       // Send result back to caller
    }

    // Method returning boolean (true/false)
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;    // Return true if even
        } else {
            return false;   // Return false if odd
        }
        // Alternative one-liner: return number % 2 == 0;
    }

    // Method returning String
    public static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else return "F";
    }

    // ==============================================================
    // 📌 4. METHOD OVERLOADING (Same name, different parameters)
    // ==============================================================

    // Version 1: Square of integer
    public static int square(int num) {
        return num * num;
    }

    // Version 2: Square of double (decimal)
    public static double square(double num) {
        return num * num;
    }

    // Version 3: Square with message
    public static String square(String numStr) {
        int num = Integer.parseInt(numStr);  // Convert string to int
        int result = num * num;
        return "Square of " + num + " is " + result;
    }

    // ==============================================================
    // 📌 5. RECURSIVE METHOD (Calls itself)
    // ==============================================================

    // Calculate factorial: 5! = 5 × 4 × 3 × 2 × 1 = 120
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;  // Base case: stop recursion
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    // ==============================================================
    // 📌 6. METHOD CALLING OTHER METHODS
    // ==============================================================

    public static void calculateCircle(double radius) {
        // Call other methods
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("For circle with radius " + radius + ":");
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

    // Helper method 1: Calculate area
    private static double calculateArea(double radius) {
        return 3.14159 * radius * radius;  // πr²
    }

    // Helper method 2: Calculate circumference
    private static double calculateCircumference(double radius) {
        return 2 * 3.14159 * radius;  // 2πr
    }

    // ==============================================================
    // 📌 7. MAIN METHOD (Entry point - where program starts)
    // ==============================================================

    public static void main(String[] args) {
        System.out.println("=== JAVA METHODS DEMONSTRATION ===\n");

        // -----------------------------
        // Calling void method (no return)
        // -----------------------------
        System.out.println("1️⃣ Calling void method:");
        greetUser();  // Just call, no variable needed
        System.out.println();

        // -----------------------------
        // Calling method with parameters
        // -----------------------------
        System.out.println("2️⃣ Calling method with parameters:");
        sayHello("Alice");  // Pass "Alice" as argument
        introduce("Bob", 25, "New York");
        System.out.println();

        // -----------------------------
        // Using return values
        // -----------------------------
        System.out.println("3️⃣ Using return values:");
        int sum = addNumbers(10, 20);  // Store returned value
        System.out.println("Sum of 10 and 20 is: " + sum);

        boolean check = isEven(17);
        System.out.println("Is 17 even? " + check);

        String grade = getGrade(85);
        System.out.println("Marks 85 gets grade: " + grade);
        System.out.println();

        // -----------------------------
        // Method overloading demo
        // -----------------------------
        System.out.println("4️⃣ Method Overloading:");
        System.out.println("Square of 5 (int): " + square(5));
        System.out.println("Square of 5.5 (double): " + square(5.5));
        System.out.println(square("6"));  // String version
        System.out.println();

        // -----------------------------
        // Recursive method
        // -----------------------------
        System.out.println("5️⃣ Recursive Method:");
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println();

        // -----------------------------
        // Method calling other methods
        // -----------------------------
        System.out.println("6️⃣ Method Calling Other Methods:");
        calculateCircle(7.0);
        System.out.println();

        // -----------------------------
        // Direct method calls in print
        // -----------------------------
        System.out.println("7️⃣ Direct Calls in Print:");
        System.out.println("2 + 3 = " + addNumbers(2, 3));
        System.out.println("Is 10 even? " + isEven(10));
    }
}