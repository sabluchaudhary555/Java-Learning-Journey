package p2methods.method;

public class CommandLineArgs {

    // 1. BASIC ARGUMENTS DISPLAY
    public static void main(String[] args) {
        System.out.println("=== Command Line Arguments Demo ===");

        // Check if arguments provided
        if(args.length == 0) {
            System.out.println("No arguments provided.");
            System.out.println("Usage: java CommandLineArgs [arguments]");
            return;
        }

        // Display number of arguments
        System.out.println("Number of arguments: " + args.length);
        System.out.println();

        // 2. DISPLAY ALL ARGUMENTS
        System.out.println("All arguments:");
        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        System.out.println();

        // 3. CALCULATOR WITH ARGUMENTS
        if(args.length >= 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                System.out.println("Calculator:");
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
                if(num2 != 0) {
                    System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide numbers for calculator.");
            }
        }
        System.out.println();

        // 4. STRING CONCATENATION
        System.out.println("Concatenated string:");
        StringBuilder concatenated = new StringBuilder();
        for(String arg : args) {
            concatenated.append(arg).append(" ");
        }
        System.out.println("Result: " + concatenated.toString().trim());
        System.out.println();

        // 5. ARGUMENT STATISTICS
        System.out.println("Statistics:");
        int totalLength = 0;
        String longest = "";
        String shortest = args[0];

        for(String arg : args) {
            totalLength += arg.length();
            if(arg.length() > longest.length()) {
                longest = arg;
            }
            if(arg.length() < shortest.length()) {
                shortest = arg;
            }
        }

        System.out.println("Total characters: " + totalLength);
        System.out.println("Average length: " + (double)totalLength / args.length);
        System.out.println("Longest argument: \"" + longest + "\" (" + longest.length() + " chars)");
        System.out.println("Shortest argument: \"" + shortest + "\" (" + shortest.length() + " chars)");
        System.out.println();

        // 6. SEARCH IN ARGUMENTS
        if(args.length >= 3) {
            String searchWord = args[args.length - 1];
            boolean found = false;
            System.out.println("Searching for \"" + searchWord + "\":");

            for(int i = 0; i < args.length - 1; i++) {
                if(args[i].equalsIgnoreCase(searchWord)) {
                    System.out.println("Found at position: " + i);
                    found = true;
                }
            }

            if(!found) {
                System.out.println("Not found in arguments.");
            }
        }
    }
}

// TO RUN THIS PROGRAM:
// Compile: javac CommandLineArgs.java
// Run with arguments: java CommandLineArgs Hello World 123 Java Programming
// Output will show all arguments processed