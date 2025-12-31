package p1_basics.data_types;

public class Type_Conversion {

    static void main(String[] args) {


        // ========================
        //     TYPE CONVERSION
        //   ========================


        // 1. IMPLICIT (Automatic - No data loss)
        int num = 100;
        double bigNum = num;           // int → double (automatic)
        System.out.println("Implicit: int " + num + " → double " + bigNum);

        // 2. EXPLICIT (Manual - Possible data loss)
        double price = 9.99;
        int intPrice = (int) price;    // Manual cast (loses .99)
        System.out.println("Explicit: double " + price + " → int " + intPrice);


        // 3. CHAR ↔ INT
        char letter = 'A';
        int ascii = letter;            // char → int (automatic)
        char back = (char) ascii;      // int → char (manual)
        System.out.println("Char '" + letter + "' ↔ int " + ascii);

        // 4. COMMON ERROR: Integer Division
        int a = 5, b = 2;
        double wrong = a / b;          //  2.0 (int division)
        double correct = (double) a / b; // 2.5 (cast first)
        System.out.println("Division: Wrong=" + wrong + " Correct=" + correct);


        // 5. STRING ↔ NUMBER
        String text = "123";
        int number = Integer.parseInt(text);  // String → int
        String backText = Integer.toString(number); // int → String
        System.out.println("String \"" + text + "\" ↔ int " + number);





    }

}
