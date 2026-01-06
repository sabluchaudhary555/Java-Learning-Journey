package p1basics.operators;

public class Operator {
    public static void main(String[] args) {

                // ====================
                // 1. ARITHMETIC OPERATORS
                // ====================
                System.out.println("=== ARITHMETIC OPERATORS ===");
                int a = 10, b = 3;

                System.out.println(a + " + " + b + " = " + (a + b));   // Addition: 13
                System.out.println(a + " - " + b + " = " + (a - b));   // Subtraction: 7
                System.out.println(a + " * " + b + " = " + (a * b));   // Multiplication: 30
                System.out.println(a + " / " + b + " = " + (a / b));   // Division: 3 (integer)
                System.out.println(a + " % " + b + " = " + (a % b));   // Modulus: 1 (remainder)



                // ====================
                // 2. UNARY OPERATORS
                // ====================
                System.out.println("\n=== UNARY OPERATORS ===");
                int x = 5;

                System.out.println("Original x = " + x);      // 5
                System.out.println("+x = " + (+x));           // Unary plus: 5
                System.out.println("-x = " + (-x));           // Unary minus: -5

                            // Increment/Decrement
                System.out.println("x++ = " + (x++));         // Post-increment: 5 (then x becomes 6)
                System.out.println("After x++: x = " + x);    // 6
                System.out.println("++x = " + (++x));         // Pre-increment: 7 (x becomes 7)

                System.out.println("x-- = " + (x--));         // Post-decrement: 7 (then x becomes 6)
                System.out.println("After x--: x = " + x);    // 6
                System.out.println("--x = " + (--x));         // Pre-decrement: 5 (x becomes 5)

                          // Logical complement (for booleans only)
                boolean flag = true;
                System.out.println("!flag = " + (!flag));     // Logical NOT: false


                // ====================
                // 3. ASSIGNMENT OPERATORS
                // ====================
                System.out.println("\n=== ASSIGNMENT OPERATORS ===");
                int num = 10;                                 // Simple assignment: =
                System.out.println("num = " + num);           // 10

                num += 5;                                     // Add AND assign: num = num + 5
                System.out.println("num += 5 → " + num);      // 15

                num -= 3;                                     // Subtract AND assign: num = num - 3
                System.out.println("num -= 3 → " + num);      // 12

                num *= 2;                                     // Multiply AND assign: num = num * 2
                System.out.println("num *= 2 → " + num);      // 24

                num /= 4;                                     // Divide AND assign: num = num / 4
                System.out.println("num /= 4 → " + num);      // 6

                num %= 4;                                     // Modulus AND assign: num = num % 4
                System.out.println("num %= 4 → " + num);      // 2

                          // Bitwise assignment operators
                num &= 3;                                     // Bitwise AND assign: num = num & 3
                System.out.println("num &= 3 → " + num);      // 2

                num |= 4;                                     // Bitwise OR assign: num = num | 4
                System.out.println("num |= 4 → " + num);      // 6

                num ^= 3;                                     // Bitwise XOR assign: num = num ^ 3
                System.out.println("num ^= 3 → " + num);      // 5

                // Shift assignment operators
                num <<= 1;                                    // Left shift assign: num = num << 1
                System.out.println("num <<= 1 → " + num);     // 10

                num >>= 1;                                    // Right shift assign: num = num >> 1
                System.out.println("num >>= 1 → " + num);     // 5



                // ====================
                // 4. RELATIONAL OPERATORS
                // ====================
                System.out.println("\n=== RELATIONAL OPERATORS ===");
                int p = 10, q = 20, r = 10;

                System.out.println(p + " == " + r + " : " + (p == r));   // Equal to: true
                System.out.println(p + " == " + q + " : " + (p == q));   // Equal to: false
                System.out.println(p + " != " + q + " : " + (p != q));   // Not equal to: true
                System.out.println(p + " < " + q + " : " + (p < q));     // Less than: true
                System.out.println(p + " > " + q + " : " + (p > q));     // Greater than: false
                System.out.println(p + " <= " + r + " : " + (p <= r));   // Less than or equal: true
                System.out.println(p + " >= " + q + " : " + (p >= q));   // Greater than or equal: false

                // instanceof operator
                String str = "Hello";
                System.out.println("str instanceof String: " + (str instanceof String));  // true

                // ====================
                // 5. LOGICAL OPERATORS
                // ====================
                System.out.println("\n=== LOGICAL OPERATORS ===");
                boolean b1 = true, b2 = false;

                System.out.println(b1 + " && " + b2 + " = " + (b1 && b2));   // AND: false
                System.out.println(b1 + " || " + b2 + " = " + (b1 || b2));   // OR: true
                System.out.println("!" + b1 + " = " + (!b1));                // NOT: false

                // Short-circuit evaluation
                System.out.println("false && (5/0==0) = " + (false && (5/0==0))); // false (no error)
                System.out.println("true || (5/0==0) = " + (true || (5/0==0)));   // true (no error)

                // ====================
                // 6. TERNARY OPERATOR
                // ====================
                System.out.println("\n=== TERNARY OPERATOR ===");
                int age = 18;
                String canVote = (age >= 18) ? "Yes" : "No";  // condition ? true_value : false_value
                System.out.println("Age " + age + " can vote? " + canVote);  // Yes

                int max = (p > q) ? p : q;                    // Find maximum
                System.out.println("Max of " + p + " and " + q + " is " + max);  // 20

                // Nested ternary
                int score = 85;
                String grade = (score >= 90) ? "A" :
                        (score >= 80) ? "B" :
                                (score >= 70) ? "C" : "F";
                System.out.println("Score " + score + " → Grade " + grade);  // B

                // ====================
                // 7. BITWISE OPERATORS
                // ====================
                System.out.println("\n=== BITWISE OPERATORS ===");
                int m = 5;    // Binary: 0101
                int n = 3;    // Binary: 0011

                System.out.println(m + " & " + n + " = " + (m & n));   // AND: 0001 = 1
                System.out.println(m + " | " + n + " = " + (m | n));   // OR: 0111 = 7
                System.out.println(m + " ^ " + n + " = " + (m ^ n));   // XOR: 0110 = 6
                System.out.println("~" + m + " = " + (~m));            // Complement: 11111010 = -6

                // Bitwise vs Logical AND/OR
                System.out.println("\nBitwise vs Logical:");
                int test = 0;
                System.out.println("false & (++test>0): " + (false & (++test>0)));  // false, test=1 (evaluated)
                test = 0;
                System.out.println("false && (++test>0): " + (false && (++test>0))); // false, test=0 (short-circuit)

                // ====================
                // 8. SHIFT OPERATORS
                // ====================
                System.out.println("\n=== SHIFT OPERATORS ===");
                int value = 8;    // Binary: 00001000

                System.out.println(value + " << 1 = " + (value << 1));   // Left shift: 00010000 = 16
                System.out.println(value + " << 2 = " + (value << 2));   // Left shift by 2: 00100000 = 32
                System.out.println(value + " >> 1 = " + (value >> 1));   // Right shift: 00000100 = 4
                System.out.println(value + " >> 2 = " + (value >> 2));   // Right shift by 2: 00000010 = 2

                // Signed vs Unsigned right shift
                int negative = -8;  // Binary: 11111000 (in 2's complement)
                System.out.println(negative + " >> 1 = " + (negative >> 1));   // Signed: -4
                System.out.println(negative + " >>> 1 = " + (negative >>> 1)); // Unsigned: 2147483644

                // ====================
                // OPERATOR PRECEDENCE
                // ====================
                System.out.println("\n=== OPERATOR PRECEDENCE EXAMPLE ===");
                int result = 10 + 3 * 2 / 4 - 1;  // Same as: 10 + ((3*2)/4) - 1
                System.out.println("10 + 3 * 2 / 4 - 1 = " + result);  // 10

                // Use parentheses to override precedence
                result = (10 + 3) * 2 / (4 - 1);
                System.out.println("(10 + 3) * 2 / (4 - 1) = " + result);  // 8
            }
        }
