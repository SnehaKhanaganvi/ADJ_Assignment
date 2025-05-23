package string_exrcise;

import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {
	 public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder result = new StringBuilder();
	        Random random = new Random();

	        if (length <= 0) {
	            return ""; // Return empty string for non-positive lengths
	        }

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            result.append(characters.charAt(index));
	        }

	        return result.toString();
	    }


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Get the desired string length from the user
	        System.out.print("Enter the length of the random string: ");
	        int length = scanner.nextInt();

	        // Generate and print the random string
	        String randomString = generateRandomString(length);
	        System.out.println("Generated Random String: " + randomString);

	        scanner.close();
	}

}
