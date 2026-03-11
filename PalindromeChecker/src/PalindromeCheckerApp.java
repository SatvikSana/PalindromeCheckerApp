import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    static void main() {


       {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                Deque<Character> deque = new LinkedList<>();

                // Insert characters into deque
                for (int i = 0; i < str.length(); i++) {
                    deque.addLast(str.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare front and rear characters
                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
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
