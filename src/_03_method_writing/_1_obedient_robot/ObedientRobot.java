package _03_method_writing._1_obedient_robot;

import java.awt.Color;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	
	Robot rob = new Robot ();
	
 
	rob.penDown();
	
	rob.setSpeed(50);
	for (int i = 0; i < 4; i++) {
		rob.setRandomPenColor();
	rob.move(200);
	rob.turn(90);
	}
	
	rob.setX(60);
	

	rob.turn(45);
	rob.move(200);
	rob.turn(90);
	rob.move(200);
	rob.turn(135);
	rob.move(300);
	
	
	String Shape = JOptionPane.showInputDialog("What shape would you like Robot rob to draw? Rectangle or Octagon");
	String color = JOptionPane.showInputDialog("What color do you want? Red, pink, or Green?");
	if(Shape.equalsIgnoreCase("octagon")) {
		if(color.equalsIgnoreCase("red")) {
				
				rob.setPenColor(Color.red);
	}
		else if(color.equalsIgnoreCase("pink")) {
			rob.setPenColor(Color.pink);
		}
		else if(color.equalsIgnoreCase("Green")) {
			rob.setPenColor(Color.green);
		}
			
			rob.setX(100);
		rob.setY(400);
		for (int i = 0; i < 9; i++) {
			
		
		rob.turn(45);
		rob.move(100);
		}}
		
	else {
			rob.setX(250);
			rob.setY(400);
			rob.move(200);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(200);
			rob.turn(90);
			rob.move(100);
		}
	
}


}