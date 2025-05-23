//4. Write a java program for getting different colors through ArrayList interface and sort them  using Collections.sort( ArrayListObj) 
package arraylistinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {

	public static void main(String[] args) {
		 // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Sort the colors using Collections.sort
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted list of colors: " + colors);
		

	}

}
