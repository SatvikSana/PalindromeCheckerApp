import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    static void main() {


        {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                Stack<Character> stack = new Stack<>();

                // Push characters into stack
                for (int i = 0; i < str.length(); i++) {
                    stack.push(str.charAt(i));
                }

                // Pop characters to form reversed string
                String reversed = "";
                while (!stack.isEmpty()) {
                    reversed += stack.pop();
                }

                if (str.equals(reversed)) {
                    System.out.println("The string is a palindrome");
                } else {
                    System.out.println("The string is not a palindrome");
                }

                sc.close();
            }
        }
    }
