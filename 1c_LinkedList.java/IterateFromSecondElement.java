package linkedlistinterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromSecondElement {

	public static void main(String[] args) {
		 // Create a LinkedList and add elements
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Purple");

        // Display the original list
        System.out.println("Full Color List: " + colorList);

        // Create a ListIterator starting from index 1 (2nd element)
        ListIterator<String> iterator = colorList.listIterator(1);

        System.out.println("\nIterating from 2nd element (index 1):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
