import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for linked list
    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; this.next = null; }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Node head = null, tail = null;

        // Create linked list
        for (int i = 0; i < str.length(); i++) {
            Node newNode = new Node(str.charAt(i));
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if (isPalindrome(head)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

        sc.close();
    }

    // Function to check palindrome
    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        // Compare first half and reversed second half
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalin = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Restore list (optional)
        slow.next = reverse(secondHalf);

        return isPalin;
    }

    // Function to reverse linked list
    static Node reverse(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
