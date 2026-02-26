import java.util.*;

public class PalindromeCheckerApp {
    public static void PalindromeCheckerApp(String[] args) {
        String str = "madam";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean isPalindrome = true;

        for (char c : str.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
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