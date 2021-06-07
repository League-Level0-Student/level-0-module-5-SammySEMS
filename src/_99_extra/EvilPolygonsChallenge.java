package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot rob = new Robot();
		//2. Set the speed to 100
rob.setSpeed(100);
		int ColorChoice =JOptionPane.showOptionDialog(null, "hello, choose a color", "person", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color Red","Color Green", "Color Blue"}, 0);
		String colorchoice = JOptionPane.showInputDialog(null, "Red green or blue?");
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}
		else if (colorChoice.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}
		else {
			rob.setPenColor(Color.blue);
		}
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

