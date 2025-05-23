//2. Write a Java program to iterate a linked list in reverse order (using  objlist.descendingIterator()) 

package linkedlistinterface;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedListIteration {

	public static void main(String[] args) {
		 // Create a LinkedList and add some colors
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Purple");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Get the descending iterator to iterate in reverse order
        Iterator<String> descendingIterator = colorList.descendingIterator();

        System.out.println("\nLinkedList in reverse order:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

	}

}
