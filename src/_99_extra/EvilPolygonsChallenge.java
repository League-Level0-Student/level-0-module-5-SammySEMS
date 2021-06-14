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
		
int colorChoice =JOptionPane.showOptionDialog(null, "hello, choose a color", "person", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color Red","Color Green", "Color Blue"}, 0);
System.out.println(colorChoice);

		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice==0) {
			rob.setPenColor(Color.red);
		}
		else if (colorChoice==1) {
		rob.setPenColor(Color.green);
	}
		else {
			rob.setPenColor(Color.blue);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String polygons = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		//5. Use the robot to draw the number of polygons the user requested.
		int polygon = Integer.parseInt(polygons);
		rob.penDown();
		for (int j = 0; j <polygon; j++) {
		for (int i = 0; i < 5; i++) {
		rob.move(100);
		rob.turn(75);
		
		}
		rob.setX(50);}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

