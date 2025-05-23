//4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing  Programming in Blue color plain font with font size of 32 using Jframe and Jlabel 

package swings;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingExample {

	public static void main(String[] args) {
		
		// Create a new frame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create the label with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: plain style, size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add the label to the frame
        frame.add(label);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size
        frame.setSize(700, 200);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
		

	}

}
