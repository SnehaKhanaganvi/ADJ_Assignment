package string_exrcise;

import java.util.Scanner;

public class RemoveWhitespaceDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        String result = removeWhitespace(input);
        System.out.println("String after removing whitespace: \"" + result + "\"");

        scanner.close();
    }

    // User-defined function to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        // Replace all whitespace (spaces, tabs, newlines, etc.) with empty string
        return str.replaceAll("\\s+", "");
	}

}
