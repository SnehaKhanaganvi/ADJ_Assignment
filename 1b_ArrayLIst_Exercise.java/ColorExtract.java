 Write a java program for getting different colors through ArrayList interface and extract the  elements 1st and 2nd from the ArrayList object by using SubList()  

package arraylistinterface;

import java.util.ArrayList;
import java.util.List;

public class ColorExtract {

	public static void main(String[] args) {
		// Create an ArrayList to store colors
        ArrayList<String> colorList = new ArrayList<>();

        // Add different colors to the ArrayList
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Purple");

        // Display the original list
        System.out.println("Original Color List: " + colorList);

        // Extract the 1st and 2nd elements using subList()
        // Note: index starts from 0, so subList(0, 2) gives elements at index 0 and 1
        List<String> firstTwoColors = colorList.subList(0, 2);

        // Display the extracted sublist
        System.out.println("First and Second Colors: " + firstTwoColors);
	}

}
