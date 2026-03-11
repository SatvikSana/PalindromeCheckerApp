import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
        {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();

                String cleaned = input.replace(" ", "").toLowerCase();
                String reversed = new StringBuilder(cleaned).reverse().toString();

                if(cleaned.equals(reversed))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not a Palindrome");
            }
        }
            }


