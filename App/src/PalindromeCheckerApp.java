class Node {
    char data;
    Node next;

    Node(char d) {
        data = d;
    }
}

public class Main {
    public static void main(String[] args) {
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
}
