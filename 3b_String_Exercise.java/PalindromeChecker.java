package string_exrcise;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to check palindrome: ");
	        String input = scanner.nextLine();

	        boolean result = isPalindrome(input);
	        if (result) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        scanner.close();
	    }

	    // User-defined function to check palindrome ignoring case and punctuation
	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;

	        // Remove all non-alphanumeric characters and convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;

	}

}
