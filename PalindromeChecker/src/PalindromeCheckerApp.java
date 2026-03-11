import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {



                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                if (isPalindrome(str, 0, str.length() - 1)) {
                    System.out.println("The string is a palindrome");
                } else {
                    System.out.println("The string is not a palindrome");
                }

                sc.close();
            }

            // Recursive function to check palindrome
            static boolean isPalindrome(String str, int start, int end) {
                if (start >= end) return true;  // Base case
                if (str.charAt(start) != str.charAt(end)) return false;  // Mismatch
                return isPalindrome(str, start + 1, end - 1);  // Recursive call
            }
        }

