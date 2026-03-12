public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {
        uc9();
        System.out.println("Program Finished.");
    }

    import java.util.Scanner;

    public static void uc9() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        if(result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if(start >= end) {
            return true;
        }

        // Check mismatch
        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
    }
}