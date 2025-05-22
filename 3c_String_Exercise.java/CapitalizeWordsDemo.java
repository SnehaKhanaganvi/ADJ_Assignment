package string_exrcise;

import java.util.Scanner;

public class CapitalizeWordsDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String capitalized = capitalizeWords(input);
        System.out.println("Capitalized sentence: " + capitalized);

        scanner.close();
    }

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter and add the rest in lowercase
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalizedSentence.append(word.substring(1).toLowerCase());
                }
                capitalizedSentence.append(" ");
            }
        }

        // Remove the trailing space and return
        return capitalizedSentence.toString().trim();
	}

}
