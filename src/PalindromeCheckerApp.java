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

        System.out.println("=== Object-Oriented Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if(result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}

// Service class (Encapsulation)
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        // Normalize string
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            if(arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}