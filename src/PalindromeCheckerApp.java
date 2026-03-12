public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {
        uc11();
        System.out.println("Program Finished.");
    }

    import java.util.Scanner;

    public static void uc11() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Strategy Pattern Palindrome Checker ===");
        System.out.println("Choose Algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeStrategy strategy;

        if(choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.checkPalindrome(input);

        if(result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}

/* Strategy Interface */
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/* Stack Implementation */
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        for(char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for(char c : normalized.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/* Deque Implementation */
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}