import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String original = sc.nextLine();

                String reversed = new StringBuilder(original).reverse().toString();

                if(original.equals(reversed)) {
                    System.out.println("The string is a palindrome");
                } else {
                    System.out.println("The string is not a palindrome");
                }

                sc.close();
            }
        }

