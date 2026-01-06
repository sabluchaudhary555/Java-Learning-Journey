package p1basics.operators;

import java.util.Scanner;

public class ComprehensiveCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║   COMPREHENSIVE JAVA CALCULATOR           ║");
        System.out.println("║                                           ║");
        System.out.println("╚═══════════════════════════════════════════╝\n");

        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    arithmeticOperations();
                    break;
                case 2:
                    unaryOperations();
                    break;
                case 3:
                    assignmentOperations();
                    break;
                case 4:
                    relationalOperations();
                    break;
                case 5:
                    logicalOperations();
                    break;
                case 6:
                    ternaryOperations();
                    break;
                case 7:
                    bitwiseOperations();
                    break;
                case 8:
                    shiftOperations();
                    break;
                case 9:
                    expressionEvaluator();
                    break;
                case 0:
                    System.out.println("\n✓ Thank you for using SSoft.in calculator!");
                    running = false;
                    break;
                default:
                    System.out.println("\n✗ Invalid choice! Please try again.\n");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n┌─────────────────────────────────────────┐");
        System.out.println("│         CALCULATOR MENU                 │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│ 1. Arithmetic Operators (+, -, *, /, %) │");
        System.out.println("│ 2. Unary Operators (++, --, +, -, !)    │");
        System.out.println("│ 3. Assignment Operators (=, +=, -=, etc)│");
        System.out.println("│ 4. Relational Operators (==, !=, <, >)  │");
        System.out.println("│ 5. Logical Operators (&&, ||, !)        │");
        System.out.println("│ 6. Ternary Operator (? :)               │");
        System.out.println("│ 7. Bitwise Operators (&, |, ^, ~)       │");
        System.out.println("│ 8. Shift Operators (<<, >>, >>>)        │");
        System.out.println("│ 9. Expression Evaluator                 │");
        System.out.println("│ 0. Exit                                 │");
        System.out.println("└─────────────────────────────────────────┘");
    }

    // 1. ARITHMETIC OPERATIONS
    private static void arithmeticOperations() {
        System.out.println("\n=== ARITHMETIC OPERATIONS ===");
        double num1 = getDoubleInput("Enter first number: ");
        double num2 = getDoubleInput("Enter second number: ");

        System.out.println("\nResults:");
        System.out.println("─────────────────────────");
        System.out.printf("%g + %g = %g%n", num1, num2, (num1 + num2));
        System.out.printf("%g - %g = %g%n", num1, num2, (num1 - num2));
        System.out.printf("%g * %g = %g%n", num1, num2, (num1 * num2));

        if (num2 != 0) {
            System.out.printf("%g / %g = %g%n", num1, num2, (num1 / num2));
            System.out.printf("%g %% %g = %g (remainder)%n", num1, num2, (num1 % num2));
        } else {
            System.out.println("Division/Modulus by zero is undefined!");
        }

        pressEnterToContinue();
    }

    // 2. UNARY OPERATIONS
    private static void unaryOperations() {
        System.out.println("\n=== UNARY OPERATIONS ===");
        int num = getIntInput("Enter an integer: ");
        int original = num;

        System.out.println("\nResults:");
        System.out.println("─────────────────────────");
        System.out.println("Original value: " + original);
        System.out.println("Unary plus (+x): " + (+num));
        System.out.println("Unary minus (-x): " + (-num));
        System.out.println("\nIncrement/Decrement:");
        System.out.println("Post-increment (x++): " + (num++) + " → value becomes " + num);
        System.out.println("Pre-increment (++x): " + (++num) + " → value is now " + num);
        System.out.println("Post-decrement (x--): " + (num--) + " → value becomes " + num);
        System.out.println("Pre-decrement (--x): " + (--num) + " → value is now " + num);

        System.out.println("\nLogical NOT (for boolean):");
        String boolInput = getStringInput("Enter true/false: ").toLowerCase();
        boolean flag = boolInput.equals("true");
        System.out.println("!(" + flag + ") = " + (!flag));

        pressEnterToContinue();
    }

    // 3. ASSIGNMENT OPERATIONS
    private static void assignmentOperations() {
        System.out.println("\n=== ASSIGNMENT OPERATIONS ===");
        int num = getIntInput("Enter initial value: ");
        int operand = getIntInput("Enter operand value: ");

        System.out.println("\nResults:");
        System.out.println("─────────────────────────");
        System.out.println("Initial: num = " + num);

        int temp = num;
        temp += operand;
        System.out.println("num += " + operand + " → " + temp);

        temp = num;
        temp -= operand;
        System.out.println("num -= " + operand + " → " + temp);

        temp = num;
        temp *= operand;
        System.out.println("num *= " + operand + " → " + temp);

        if (operand != 0) {
            temp = num;
            temp /= operand;
            System.out.println("num /= " + operand + " → " + temp);

            temp = num;
            temp %= operand;
            System.out.println("num %= " + operand + " → " + temp);
        }

        System.out.println("\nBitwise Assignment:");
        temp = num;
        temp &= operand;
        System.out.println("num &= " + operand + " → " + temp);

        temp = num;
        temp |= operand;
        System.out.println("num |= " + operand + " → " + temp);

        temp = num;
        temp ^= operand;
        System.out.println("num ^= " + operand + " → " + temp);

        pressEnterToContinue();
    }

    // 4. RELATIONAL OPERATIONS
    private static void relationalOperations() {
        System.out.println("\n=== RELATIONAL OPERATIONS ===");
        double num1 = getDoubleInput("Enter first number: ");
        double num2 = getDoubleInput("Enter second number: ");

        System.out.println("\nResults:");
        System.out.println("─────────────────────────");
        System.out.printf("%g == %g : %b%n", num1, num2, (num1 == num2));
        System.out.printf("%g != %g : %b%n", num1, num2, (num1 != num2));
        System.out.printf("%g < %g  : %b%n", num1, num2, (num1 < num2));
        System.out.printf("%g > %g  : %b%n", num1, num2, (num1 > num2));
        System.out.printf("%g <= %g : %b%n", num1, num2, (num1 <= num2));
        System.out.printf("%g >= %g : %b%n", num1, num2, (num1 >= num2));

        pressEnterToContinue();
    }

    // 5. LOGICAL OPERATIONS
    private static void logicalOperations() {
        System.out.println("\n=== LOGICAL OPERATIONS ===");
        String input1 = getStringInput("Enter first boolean (true/false): ").toLowerCase();
        String input2 = getStringInput("Enter second boolean (true/false): ").toLowerCase();

        boolean b1 = input1.equals("true");
        boolean b2 = input2.equals("true");

        System.out.println("\nResults:");
        System.out.println("─────────────────────────");
        System.out.println(b1 + " && " + b2 + " (AND) = " + (b1 && b2));
        System.out.println(b1 + " || " + b2 + " (OR)  = " + (b1 || b2));
        System.out.println("!" + b1 + " (NOT) = " + (!b1));
        System.out.println("!" + b2 + " (NOT) = " + (!b2));

        System.out.println("\nShort-circuit demonstration:");
        System.out.println("false && (5/0==0) = " + (false && checkDivision()));
        System.out.println("true || (5/0==0) = " + (true || checkDivision()));

        pressEnterToContinue();
    }

    private static boolean checkDivision() {
        System.out.print("(This won't print due to short-circuit) ");
        return 5/0 == 0;
    }

    // 6. TERNARY OPERATIONS
    private static void ternaryOperations() {
        System.out.println("\n=== TERNARY OPERATOR (? :) ===");

        System.out.println("\n1. Age Voting Eligibility:");
        int age = getIntInput("Enter age: ");
        String canVote = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Result: " + canVote);

        System.out.println("\n2. Find Maximum:");
        int num1 = getIntInput("Enter first number: ");
        int num2 = getIntInput("Enter second number: ");
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum: " + max);

        System.out.println("\n3. Grade Calculator:");
        int score = getIntInput("Enter score (0-100): ");
        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" :
                                (score >= 60) ? "D" : "F";
        System.out.println("Grade: " + grade);

        System.out.println("\n4. Even/Odd Check:");
        int number = getIntInput("Enter a number: ");
        String parity = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Result: " + parity);

        pressEnterToContinue();
    }

    // 7. BITWISE OPERATIONS
    private static void bitwiseOperations() {
        System.out.println("\n=== BITWISE OPERATIONS ===");
        int num1 = getIntInput("Enter first integer: ");
        int num2 = getIntInput("Enter second integer: ");

        System.out.println("\nResults:");
        System.out.println("─────────────────────────");
        System.out.printf("%d (binary: %s)%n", num1, Integer.toBinaryString(num1));
        System.out.printf("%d (binary: %s)%n", num2, Integer.toBinaryString(num2));
        System.out.println();
        System.out.printf("%d & %d = %d (AND)%n", num1, num2, (num1 & num2));
        System.out.printf("%d | %d = %d (OR)%n", num1, num2, (num1 | num2));
        System.out.printf("%d ^ %d = %d (XOR)%n", num1, num2, (num1 ^ num2));
        System.out.printf("~%d = %d (NOT/Complement)%n", num1, (~num1));
        System.out.printf("~%d = %d (NOT/Complement)%n", num2, (~num2));

        pressEnterToContinue();
    }

    // 8. SHIFT OPERATIONS
    private static void shiftOperations() {
        System.out.println("\n=== SHIFT OPERATIONS ===");
        int num = getIntInput("Enter an integer: ");
        int shift = getIntInput("Enter shift amount: ");

        System.out.println("\nResults:");
        System.out.println("─────────────────────────");
        System.out.println("Original: " + num + " (binary: " + Integer.toBinaryString(num) + ")");
        System.out.println();
        System.out.printf("%d << %d = %d (Left shift)%n", num, shift, (num << shift));
        System.out.printf("%d >> %d = %d (Signed right shift)%n", num, shift, (num >> shift));
        System.out.printf("%d >>> %d = %d (Unsigned right shift)%n", num, shift, (num >>> shift));

        System.out.println("\nNote:");
        System.out.println("• Left shift (<<): Multiplies by 2^shift");
        System.out.println("• Right shift (>>): Divides by 2^shift (preserves sign)");
        System.out.println("• Unsigned right shift (>>>): Fills with zeros");

        pressEnterToContinue();
    }

    // 9. EXPRESSION EVALUATOR
    private static void expressionEvaluator() {
        System.out.println("\n=== EXPRESSION EVALUATOR ===");
        System.out.println("This demonstrates operator precedence.");

        int a = getIntInput("Enter value for 'a': ");
        int b = getIntInput("Enter value for 'b': ");
        int c = getIntInput("Enter value for 'c': ");

        System.out.println("\nEvaluating expressions:");
        System.out.println("─────────────────────────");


        int result1 = a + b * c;
        System.out.printf("a + b * c = %d + %d * %d = %d%n", a, b, c, result1);
        System.out.println("(Multiplication has higher precedence)");

        int result2 = (a + b) * c;
        System.out.printf("%n(a + b) * c = (%d + %d) * %d = %d%n", a, b, c, result2);
        System.out.println("(Parentheses override precedence)");

        int result3 = a + b * c / a - b;
        System.out.printf("%na + b * c / a - b = %d%n", result3);
        System.out.println("(Order: *, /, then +, -)");

        boolean boolResult = (a > b) && (b < c) || (a == c);
        System.out.printf("%n(a > b) && (b < c) || (a == c) = %b%n", boolResult);
        System.out.println("(Order: relational, then &&, then ||)");

        pressEnterToContinue();
    }

    // UTILITY METHODS
    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter an integer: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return value;
    }

    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Enter a number: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        return value;
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static void pressEnterToContinue() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
}

// Created By SSoft.in
// Sablu Softwate IT Solutions