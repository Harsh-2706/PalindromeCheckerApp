public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {
        uc10();
        System.out.println("Program Finished.");
    }

    import java.util.Scanner;

    public static void uc10) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize the string
        String normalized = normalizeString(input);

        boolean result = isPalindromeRecursive(normalized, 0, normalized.length() - 1);

        if(result) {
            System.out.println("The string is a Palindrome (ignoring spaces and case).");
        }
        else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }

    // String preprocessing using regex
    public static String normalizeString(String str) {
        str = str.toLowerCase();              // ignore case
        str = str.replaceAll("[^a-z0-9]", ""); // remove spaces & special characters
        return str;
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