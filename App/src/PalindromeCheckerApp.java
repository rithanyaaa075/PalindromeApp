import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueApp = true;

        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App ");
        System.out.println("====================================");

        while (continueApp) {

            // Use Case 1: Take Input
            System.out.print("\nEnter a word or number: ");
            String input = scanner.nextLine();

            // Use Case 2: Check Palindrome
            if (isPalindrome(input)) {
                System.out.println("Result: \"" + input + "\" is a Palindrome ✅");
            } else {
                System.out.println("Result: \"" + input + "\" is NOT a Palindrome ❌");
            }

            // Use Case 3: Ask to Continue
            System.out.print("\nDo you want to check another? (yes/no): ");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                continueApp = false;
                System.out.println("\nThank you for using Palindrome Checker App!");
            }
        }

        scanner.close();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();  // remove spaces & ignore case
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}