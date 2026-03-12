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

        System.out.println("=== Palindrome Algorithm Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Recursive Method
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeRecursive(normalized, 0, normalized.length() - 1);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeStack(normalized);
        long end2 = System.nanoTime();

        // Deque Method
        long start3 = System.nanoTime();
        boolean result3 = isPalindromeDeque(normalized);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Recursive Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }

    // Recursive Method
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if(start >= end) {
            return true;
        }

        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Stack Method
    public static boolean isPalindromeStack(String str) {

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
        }

        for(char c : str.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean isPalindromeDeque(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()) {
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