package string_exrcise;

import java.util.Scanner;

public class SubstringCount {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        System.out.print("Enter the substring to count: ");
	        String substring = scanner.nextLine();

	        int count = countOccurrences(mainString, substring);
	        System.out.println("The substring \"" + substring + "\" appears " + count + " times in the main string.");

	        scanner.close();
	    }

	    // Function to count occurrences of a substring in a string
	    public static int countOccurrences(String mainString, String substring) {
	        if (mainString == null || substring == null || substring.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int fromIndex = 0;

	        while (true) {
	            int index = mainString.indexOf(substring, fromIndex);
	            if (index == -1) {
	                break;
	            }
	            count++;
	            fromIndex = index + substring.length();
	        }

	        return count;
	}

}
