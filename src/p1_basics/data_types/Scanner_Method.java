
package p1_basics.data_types;


import java.util.Scanner;

 public class Scanner_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* =========================================
         * 📖 STRING INPUT METHODS
         * ========================================= */

        // 1. next() - Single word (stops at space)
        System.out.print("Enter a word: ");
        String word = sc.next();          // "Hello World" → "Hello"
        System.out.println("next(): " + word);
        sc.nextLine();  // Clear buffer after next()

        // 2. nextLine() - Entire line (includes spaces)
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();  // "Hello World" → "Hello World"
        System.out.println("nextLine(): " + sentence);

        /* =========================================
         *  INTEGER INPUT METHODS
         * ========================================= */

        // 3. nextInt() - Most common for DSA
        System.out.print("Enter an integer: ");
        int intNum = sc.nextInt();        // "42" → 42
        System.out.println("nextInt(): " + intNum);

        // 4. nextByte() - Small number (-128 to 127)
        System.out.print("Enter byte (≤127): ");
        byte byteNum = sc.nextByte();     // "100" → 100
        System.out.println("nextByte(): " + byteNum);

        // 5. nextShort() - Small number (-32768 to 32767)
        System.out.print("Enter short (≤32767): ");
        short shortNum = sc.nextShort();  // "2000" → 2000
        System.out.println("nextShort(): " + shortNum);

        // 6. nextLong() - Large number (add L suffix)
        System.out.print("Enter long: ");
        long longNum = sc.nextLong();     // "10000000000" → 10000000000L
        System.out.println("nextLong(): " + longNum);

        /* =========================================
         * DECIMAL INPUT METHODS
         * ========================================= */

        // 7. nextFloat() - Decimal (add f suffix)
        System.out.print("Enter float: ");
        float floatNum = sc.nextFloat();  // "3.14" → 3.14f
        System.out.println("nextFloat(): " + floatNum);

        // 8. nextDouble() - Recommended for decimals
        System.out.print("Enter double: ");
        double doubleNum = sc.nextDouble(); // "3.14159" → 3.14159
        System.out.println("nextDouble(): " + doubleNum);

        /* =========================================
         * BOOLEAN INPUT METHOD
         * ========================================= */

        // 9. nextBoolean() - true/false only
        System.out.print("Enter boolean (true/false): ");
        boolean boolVal = sc.nextBoolean(); // "true" → true
        System.out.println("nextBoolean(): " + boolVal);

        /* =========================================
         *  BUFFER CLEARING DEMO (CRITICAL!)
         * ========================================= */
        System.out.println("\n" + "=".repeat(50));
        System.out.println("BUFFER CLEARING DEMONSTRATION");
        System.out.println("=".repeat(50));

        // Clear any leftover input
        sc.nextLine();

        // WRONG: Without buffer clearing
        System.out.print("Enter age (int): ");
        int age = sc.nextInt();           // Reads number

        System.out.print("Enter name: ");
        String nameWrong = sc.nextLine(); //  SKIPS! Reads empty
        System.out.println("WRONG - Name: '" + nameWrong + "'");

        // Reset for correct example
        System.out.print("\nEnter age again: ");
        age = sc.nextInt();
        sc.nextLine();                    //  MUST CLEAR BUFFER!

        System.out.print("Enter name: ");
        String nameCorrect = sc.nextLine(); // Works!
        System.out.println("CORRECT - Name: '" + nameCorrect + "'");

        /* =========================================
         * INPUT VALIDATION (hasNext methods)
         * ========================================= */
        System.out.println("\n" + "=".repeat(50));
        System.out.println("INPUT VALIDATION EXAMPLES");
        System.out.println("=".repeat(50));

        // Check before reading to avoid InputMismatchException
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {            //  Safe check
            int safeNum = sc.nextInt();
            System.out.println("Valid number: " + safeNum);
        } else {
            System.out.println("Not a valid number!");
            sc.next();                    // Clear invalid input
        }

        sc.close();  // Close scanner
    }
}