import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
      {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                char[] arr = str.toCharArray();
                int start = 0;
                int end = arr.length - 1;
                boolean isPalindrome = true;

                while(start < end) {
                    if(arr[start] != arr[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if(isPalindrome) {
                    System.out.println("The string is a palindrome");
                } else {
                    System.out.println("The string is not a palindrome");
                }

                sc.close();
            }
        }
    }
