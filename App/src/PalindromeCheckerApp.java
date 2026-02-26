 UC8
class Node {
    char data;
    Node next;

    Node(char d) {
        data = d;
    }
}

public class PalindromeCheckerApp {
    public static void PalindromeCheckerApp(String[] args) {
        String str = "madam";
        Node head = null, temp = null;

        // Create linked list
        for (char c : str.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Check palindrome
        String original = "", reverse = "";
        temp = head;
        while (temp != null) {
            original += temp.data;
            reverse = temp.data + reverse;
            temp = temp.next;
        }

        if (original.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
=======
import java.util.*

public class PalindromeCheckerApp {
    public static void PalindromeCheckerApp(String[] args) {
        String str = "madam";
        Deque<Character> deque = new LinkedList<>();
        boolean isPalindrome = true;

        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
 main
}