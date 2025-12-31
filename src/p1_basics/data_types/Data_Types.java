package p1_basics.data_types;

public class Data_Types {
    public static void main(String[] args) {
        // ========== 1. PRIMITIVE DATA TYPES ==========

        // Integer Types (whole numbers)
        byte byteVar = 127;                 // 8-bit, range: -128 to 127
        short shortVar = 32767;             // 16-bit, range: -32,768 to 32,767
        int intVar = 2147483647;            // 32-bit, range: -2^31 to 2^31-1
        long longVar = 9223372036854775807L; // 64-bit, suffix 'L'

        // Floating-Point Types (decimal numbers)
        float floatVar = 3.14159f;          // 32-bit, suffix 'f'
        double doubleVar = 3.141592653589793; // 64-bit, default for decimals

        // Character Type
        char charVar = 'A';                 // 16-bit Unicode, single quotes

        // Boolean Type
        boolean boolVar = true;             // true or false only

        // ========== 2. REFERENCE DATA TYPES ==========

        // String (most commonly used)
        String stringVar = "Hello Java";    // Double quotes, NOT primitive!

        // Array
        int[] intArray = {1, 2, 3, 4, 5};

        // Class/Object
        Object objVar = new Object();

        // ========== 3. PRINT ALL VALUES ==========

        System.out.println("=== PRIMITIVE TYPES ===");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);

        System.out.println("\n=== REFERENCE TYPES ===");
        System.out.println("String: " + stringVar);
        System.out.println("Array: " + java.util.Arrays.toString(intArray));
        System.out.println("Object: " + objVar.getClass().getName());



    }
}
