package string_exrcise;

import java.util.Scanner;

public class WordCounter {
	 public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0; // No words in null or empty string
	        }

	        // Split the string by whitespace and count the words
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Call the countWords function
	        int wordCount = countWords(input);

	        // Display the result
	        System.out.println("Number of words: " + wordCount);

	        scanner.close();
	}

}
