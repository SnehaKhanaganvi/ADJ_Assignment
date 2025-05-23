package string_exrcise;

import java.util.Scanner;

public class NumericChecker {
	public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Null or empty strings are not numeric
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false; // Found a non-digit character
            }
        }

        return true; // All characters are digits
    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the isNumeric function
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
	}

}
