public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "Madam In Eden";

        str = str.replaceAll("\\s+", "").toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}