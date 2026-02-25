public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {
        uc4();
        System.out.println("Program Finished.");
    }


    public static void uc4() {
        String word = "radar";
        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
    }
}