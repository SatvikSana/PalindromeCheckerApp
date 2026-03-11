import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {



         {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                Stack<Character> stack = new Stack<>();
                Queue<Character> queue = new LinkedList<>();

                // Insert characters into stack and queue
                for (int i = 0; i < str.length(); i++) {
                    stack.push(str.charAt(i));
                    queue.add(str.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare characters
                while (!stack.isEmpty()) {
                    if (stack.pop() != queue.remove()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("The string is a palindrome");
                } else {
                    System.out.println("The string is not a palindrome");
                }

                sc.close();
            }
        }
    }
