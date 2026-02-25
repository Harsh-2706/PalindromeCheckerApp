public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {
        uc1();
        uc2();
        uc3();
        uc4();
//        uc5();
//        uc6();
//        uc7();
//        uc8();
//        uc9();
//        uc10();
//        uc11();
//        uc12();
//        uc13();
        System.out.println("Program Finished.");
    }

    public static void uc1() {
        System.out.println("=================================");
        System.out.println("Welcome to the Application");
        System.out.println("Application Name: " + APP_NAME);
        System.out.println("Application Version: " + APP_VERSION);
        System.out.println("=================================");
    }
    public static void uc2() {
        String word = "madam";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
    public static void uc3() {
        String original = "level";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
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
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}