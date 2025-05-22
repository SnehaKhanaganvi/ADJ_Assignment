package linkedlistinterface;

import java.util.LinkedList;

public class DisplayElementsWithPositions {

	public static void main(String[] args) {
		 // Create a LinkedList and add some colors
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Pink");

        // Display elements and their positions using get(p)
        System.out.println("Elements and their positions in the LinkedList:");

        for (int i = 0; i < colorList.size(); i++) {
            // Use get(i) to get element at position i
            System.out.println("Position " + i + ": " + colorList.get(i));
        }

	}

}
