import java.util.*;

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
}