package linkedlistinterface;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElementsInLinkedList {

	public static void main(String[] args) {
		// Create a LinkedList and add some colors
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");     // index 0
        colorList.add("Blue");    // index 1
        colorList.add("Green");   // index 2
        colorList.add("Yellow");  // index 3

        // Display original list
        System.out.println("Original LinkedList: " + colorList);

        // Swap first (index 0) and third (index 2) elements
        Collections.swap(colorList, 0, 2);

        // Display list after swapping
        System.out.println("After swapping first and third elements: " + colorList);

	}

}
