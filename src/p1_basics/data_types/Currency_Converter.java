package p1_basics.data_types;

import java.util.Scanner;

/**
 * Indian Rupee Currency Converter Application
 * Demonstrates: Variables, Data Types, and Type Conversion in Java
 * This project covers:
 * - Primitive data types (int, double, float, long, boolean, char, byte, short)
 * - Reference data types (String, Scanner)
 * - Variable declaration and initialization
 * - Type conversion (implicit and explicit casting)
 * - Wrapper classes and autoboxing/unboxing
 */
public class Currency_Converter {

    public static void main(String[] args) {

        // ============================================
        // SECTION 1: PRIMITIVE DATA TYPES
        // ============================================

        // byte: 8-bit integer (-128 to 127) - for small numbers
        byte transactionFee = 5; // Fee in rupees

        // short: 16-bit integer (-32,768 to 32,767) - for moderate numbers
        short smallAmount = 5000; // Small transaction amount

        // int: 32-bit integer (most commonly used for whole numbers)
        int transactionCount = 0; // Counter for number of conversions

        // long: 64-bit integer (for very large numbers)
        long totalTransactionsIndia = 1234567890L; // Note: 'L' suffix for long literals

        // float: 32-bit floating point (single precision)
        float processingTime = 2.5f; // Note: 'f' suffix for float literals

        // double: 64-bit floating point (double precision - preferred for decimals)
        // Exchange rates (as of recent data)
        double inrToJpy = 1.80;     // 1 INR = 1.80 JPY
        double inrToSar = 0.045;    // 1 INR = 0.045 SAR
        double inrToEur = 0.011;    // 1 INR = 0.011 EUR
        double inrToUsd = 0.012;    // 1 INR = 0.012 USD

        // Reverse rates for vice versa conversion
        double jpyToInr = 1 / inrToJpy;   // JPY to INR
        double sarToInr = 1 / inrToSar;   // SAR to INR
        double eurToInr = 1 / inrToEur;   // EUR to INR
        double usdToInr = 1 / inrToUsd;   // USD to INR

        // boolean: true or false
        boolean isOnline = true;
        boolean requiresAuthentication = false;

        // char: Single 16-bit Unicode character
        char inrSymbol = '₹';
        char jpySymbol = '¥';
        char sarSymbol = '﷼';
        char eurSymbol = '€';
        char usdSymbol = '$';


        // ============================================
        // SECTION 2: REFERENCE DATA TYPES
        // ============================================

        // String: Reference type for text (not primitive)
        String appName = "Indian Rupee Currency Converter";
        String version = "v1.0";
        String developer = "SSoft IT solution";
        String country = "India";

        // Scanner: Reference type for user input
        Scanner scanner = new Scanner(System.in);


        // ============================================
        // SECTION 3: DISPLAY WELCOME MESSAGE
        // ============================================

        System.out.println("═══════════════════════════════════════════════");
        System.out.println("  " + appName + "                              ");
        System.out.println("              " + version + "                  ");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println();
        System.out.println("Developed by: " + developer);
        System.out.println("Country: " + country);
        System.out.println("Status: " + (isOnline ? "Online ✓" : "Offline ✗"));
        System.out.println("Average Processing Time: " + processingTime + " seconds");
        System.out.println("Total Transactions Today: " + totalTransactionsIndia);
        System.out.println();


        // ============================================
        // SECTION 4: MAIN CONVERSION LOOP
        // ============================================

        boolean continueConverting = true;

        while (continueConverting) {

            // Display menu
            System.out.println("\n══════════════════════════════════════════════");
            System.out.println("        Select Conversion Type:");
            System.out.println("══════════════════════════════════════════════");
            System.out.println("1.  INR → JPY (Japanese Yen)");
            System.out.println("2.  INR → SAR (Saudi Riyal)");
            System.out.println("3.  INR → EUR (Euro)");
            System.out.println("4.  INR → USD (US Dollar)");
            System.out.println("──────────────────────────────────────────────");
            System.out.println("5.  JPY → INR (Japanese Yen to Rupee)");
            System.out.println("6.  SAR → INR (Saudi Riyal to Rupee)");
            System.out.println("7.  EUR → INR (Euro to Rupee)");
            System.out.println("8.  USD → INR (US Dollar to Rupee)");
            System.out.println("──────────────────────────────────────────────");
            System.out.println("9.  Exit");
            System.out.println("══════════════════════════════════════════════");
            System.out.print("Enter your choice (1-9): ");


            // ============================================
            // SECTION 5: TYPE CONVERSION - STRING TO INT
            // ============================================

            // Reading input as String first
            String choiceInput = scanner.nextLine();

            // Explicit type conversion: String → int (using wrapper class)
            int choice;
            try {
                choice = Integer.parseInt(choiceInput); // String to int conversion
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }


            // Exit condition
            if (choice == 9) {
                continueConverting = false;
                System.out.println("\n✓ Thank you for using " + appName + "!");
                System.out.println("✓ Total conversions performed: " + transactionCount);
                break;
            }


            // Validate choice
            if (choice < 1 || choice > 9) {
                System.out.println("Invalid choice! Please select 1-9.");
                continue;
            }


            // ============================================
            // SECTION 6: DETERMINE SOURCE AND TARGET CURRENCY
            // ============================================

            String sourceCurrency = "";
            String targetCurrency = "";
            char sourceSymbol = ' ';
            char targetSymbol = ' ';
            double conversionRate = 0.0;
            boolean isFromINR = true; // Flag to check if converting from INR

            switch (choice) {
                case 1:
                    sourceCurrency = "INR";
                    targetCurrency = "JPY";
                    sourceSymbol = inrSymbol;
                    targetSymbol = jpySymbol;
                    conversionRate = inrToJpy;
                    isFromINR = true;
                    break;

                case 2:
                    sourceCurrency = "INR";
                    targetCurrency = "SAR";
                    sourceSymbol = inrSymbol;
                    targetSymbol = sarSymbol;
                    conversionRate = inrToSar;
                    isFromINR = true;
                    break;

                case 3:
                    sourceCurrency = "INR";
                    targetCurrency = "EUR";
                    sourceSymbol = inrSymbol;
                    targetSymbol = eurSymbol;
                    conversionRate = inrToEur;
                    isFromINR = true;
                    break;

                case 4:
                    sourceCurrency = "INR";
                    targetCurrency = "USD";
                    sourceSymbol = inrSymbol;
                    targetSymbol = usdSymbol;
                    conversionRate = inrToUsd;
                    isFromINR = true;
                    break;

                case 5:
                    sourceCurrency = "JPY";
                    targetCurrency = "INR";
                    sourceSymbol = jpySymbol;
                    targetSymbol = inrSymbol;
                    conversionRate = jpyToInr;
                    isFromINR = false;
                    break;

                case 6:
                    sourceCurrency = "SAR";
                    targetCurrency = "INR";
                    sourceSymbol = sarSymbol;
                    targetSymbol = inrSymbol;
                    conversionRate = sarToInr;
                    isFromINR = false;
                    break;

                case 7:
                    sourceCurrency = "EUR";
                    targetCurrency = "INR";
                    sourceSymbol = eurSymbol;
                    targetSymbol = inrSymbol;
                    conversionRate = eurToInr;
                    isFromINR = false;
                    break;

                case 8:
                    sourceCurrency = "USD";
                    targetCurrency = "INR";
                    sourceSymbol = usdSymbol;
                    targetSymbol = inrSymbol;
                    conversionRate = usdToInr;
                    isFromINR = false;
                    break;
            }


            // ============================================
            // SECTION 7: GET AMOUNT TO CONVERT
            // ============================================

            System.out.print("\nEnter amount in " + sourceCurrency + " " + sourceSymbol + ": ");
            String amountInput = scanner.nextLine();


            // ============================================
            // SECTION 8: TYPE CONVERSION - STRING TO DOUBLE
            // ============================================

            double sourceAmount;
            try {
                // Explicit conversion: String → double
                sourceAmount = Double.parseDouble(amountInput);
            } catch (NumberFormatException e) {
                System.out.println(" Invalid amount! Please enter a valid number.");
                continue;
            }


            // Validate amount
            if (sourceAmount <= 0) {
                System.out.println(" Amount must be greater than zero!");
                continue;
            }


            // ============================================
            // SECTION 9: PERFORM CONVERSION
            // ============================================

            // double * double = double (no conversion needed)
            double convertedAmount = sourceAmount * conversionRate;


            // ============================================
            // SECTION 10: IMPLICIT TYPE CONVERSION (WIDENING)
            // ============================================

            // byte → short → int → long → float → double (automatic widening)

            // byte to short (implicit)
            short feeShort = transactionFee; // byte → short (automatic)

            // short to int (implicit)
            int feeInt = feeShort; // short → int (automatic)

            // int to long (implicit)
            long feeLong = feeInt; // int → long (automatic)

            // long to float (implicit - may lose precision)
            float feeFloat = feeLong; // long → float (automatic)

            // float to double (implicit)
            double feeDouble = feeFloat; // float → double (automatic)

            // Calculate fee in INR (byte converted to double implicitly in operation)
            // Fee removed - pure conversion without charges


            // ============================================
            // SECTION 11: EXPLICIT TYPE CONVERSION (NARROWING/CASTING)
            // ============================================

            // double to int (explicit cast - loses decimal part)
            int convertedAmountInt = (int) convertedAmount; // Truncates decimal

            // double to long (explicit cast)
            long convertedAmountLong = (long) convertedAmount;

            // double to float (explicit cast - may lose precision)
            float convertedAmountFloat = (float) convertedAmount;

            // Rounding using Math class and casting
            int roundedAmount = (int) Math.round(convertedAmount); // Rounds to nearest integer

            // Floor and Ceil operations with casting
            int floorAmount = (int) Math.floor(convertedAmount); // Round down
            int ceilAmount = (int) Math.ceil(convertedAmount);   // Round up


            // ============================================
            // SECTION 12: WRAPPER CLASSES & AUTOBOXING
            // ============================================

            // Primitive to Wrapper (Boxing)
            Integer transactionCountWrapper = Integer.valueOf(transactionCount);
            Double amountWrapper = Double.valueOf(sourceAmount);
            Boolean statusWrapper = Boolean.valueOf(isOnline);
            Character symbolWrapper = Character.valueOf(sourceSymbol);

            // Autoboxing (automatic primitive to wrapper)
            Integer autoBoxed = transactionCount; // Automatic boxing
            Double autoBoxedDouble = sourceAmount;

            // Unboxing (wrapper to primitive)
            int unboxedValue = transactionCountWrapper.intValue();
            double unboxedDouble = amountWrapper.doubleValue();

            // Auto-unboxing (automatic wrapper to primitive)
            int autoUnboxed = transactionCountWrapper; // Automatic unboxing
            double autoUnboxedDouble = autoBoxedDouble;


            // ============================================
            // SECTION 13: STRING CONVERSIONS
            // ============================================

            // Primitive to String
            String sourceAmountString = String.valueOf(sourceAmount);
            String convertedString = Double.toString(convertedAmount);
            String rateString = String.valueOf(conversionRate);

            // Using String concatenation (implicit conversion)
            String result = "Amount: " + sourceAmount; // double → String (implicit)

            // String formatting
            String formattedResult = String.format("%.2f %s = %.2f %s",
                    sourceAmount, sourceCurrency,
                    convertedAmount, targetCurrency);


            // ============================================
            // SECTION 14: DISPLAY RESULTS
            // ============================================

            System.out.println("\n═══════════════════════════════════════════════");
            System.out.println("            CONVERSION RESULT                    ");
            System.out.println("  ═══════════════════════════════════════════════");

            // Format output with 2 decimal places
            System.out.printf("Original Amount    : %c %.2f %s\n", sourceSymbol, sourceAmount, sourceCurrency);
            System.out.printf("Exchange Rate      : 1 %s = %.4f %s\n", sourceCurrency, conversionRate, targetCurrency);
            System.out.printf("Converted Amount   : %c %.2f %s\n", targetSymbol, convertedAmount, targetCurrency);
            System.out.println("───────────────────────────────────────────────");
            System.out.println("Formatted: " + formattedResult);


            // ============================================
            // SECTION 15: INCREMENT COUNTER
            // ============================================

            // Post-increment operator (returns value then increments)
            transactionCount++; // transactionCount = transactionCount + 1

            // Could also use:
            // transactionCount += 1;  // Compound assignment
            // transactionCount = transactionCount + 1;  // Basic increment
            // ++transactionCount;  // Pre-increment

            System.out.println("\n✓ Conversion #" + transactionCount + " completed successfully!");

        } // End of while loop


        // ============================================
        // SECTION 16: CLEANUP AND FINAL STATISTICS
        // ============================================

        scanner.close(); // Close Scanner to prevent resource leak

        System.out.println("\n═══════════════════════════════════════════════");
        System.out.println("          Session Statistics:");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("• Total Transactions: " + transactionCount);
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("\nThank you for using SSoft services !");


    }
}

