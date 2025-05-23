//3. Write a Java program to insert the specified element at the end of a linked list.( using  l_listobj.offerLast("Pink")) 

package linkedlistinterface;

import java.util.LinkedList;

public class InsertElementAtEnd {

	public static void main(String[] args) {
		// Create a LinkedList and add some colors
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");

        // Display original list
        System.out.println("Original LinkedList: " + colorList);

        // Insert "Pink" at the end of the linked list using offerLast()
        boolean added = colorList.offerLast("Pink");

        // offerLast() returns true if the element was added successfully
        if (added) {
            System.out.println("After inserting 'Pink' at the end:");
            System.out.println(colorList);
        } else {
            System.out.println("Failed to add 'Pink' to the list.");
        }

	}

}
