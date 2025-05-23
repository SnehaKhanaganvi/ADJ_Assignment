// 6. Write a java program for getting different colors through ArrayList interface and delete nth  element from the ArrayList object by using remove by index 

package arraylistinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorDelete {

	public static void main(String[] args) {
		 // Create an ArrayList to store colors
        ArrayList<String> colorList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Purple");

        // Display the original list
        System.out.println("Original Color List: " + colorList);

        // Get user input for the index (n) of the element to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the color to delete: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if(index >= 0 && index < colorList.size()) {
            // Remove the element at the given index
            String removedColor = colorList.remove(index);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index! No color removed.");
        }

        // Display the updated list
        System.out.println("Updated Color List: " + colorList);

        // Close the scanner
        scanner.close();
	}

}
