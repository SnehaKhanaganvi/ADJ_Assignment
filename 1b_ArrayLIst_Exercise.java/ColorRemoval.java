//2. Write a java program for getting different colors through ArrayList interface and remove the  2nd element and color "Blue" from the ArrayList  

package arraylistinterface;

import java.util.ArrayList;

public class ColorRemoval {

	public static void main(String[] args) {
		// Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedElement = colors.remove(1);
            System.out.println("Removed 2nd element: " + removedElement);
        } else {
            System.out.println("List does not have a 2nd element to remove.");
        }

        // Remove the color "Blue"
        boolean isBlueRemoved = colors.remove("Blue");
        if (isBlueRemoved) {
            System.out.println("Color 'Blue' has been removed.");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display final list
        System.out.println("Updated list of colors: " + colors);

	}

}
