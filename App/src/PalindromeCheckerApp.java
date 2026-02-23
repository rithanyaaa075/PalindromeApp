import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueApp = true;

        System.out.println("==========================================");
        System.out.println(" Welcome to Palindrome Checker App ");
        System.out.println("==========================================");

        while (continueApp) {

            // Take Input
            System.out.print("\nEnter a word or number: ");
            String input = scanner.nextLine();

            // Process input (remove spaces & lowercase)
            String processedInput = input.replaceAll("\\s+", "").toLowerCase();

            // Check Palindrome
            if (isPalindrome(processedInput)) {
                System.out.println("Result: \"" + input + "\" is a Palindrome ");
            } else {
                System.out.println("Result: \"" + input + "\" is NOT a Palindrome ");
            }

            // Ask to continue
            System.out.print("\nDo you want to check another? (yes/no): ");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                continueApp = false;
            }
        }

        System.out.println("\nThank you for using Palindrome Checker App!");
        scanner.close();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}