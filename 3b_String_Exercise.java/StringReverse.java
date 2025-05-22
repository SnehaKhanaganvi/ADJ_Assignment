package string_exrcise;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }

	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }

	        StringBuilder reversed = new StringBuilder();

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }

	        return reversed.toString();
	}

}
