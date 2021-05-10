package _03_method_writing._1_obedient_robot;

import java.awt.Color;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	static Robot rob = new Robot();

	public static void drawSquare() {

		for (int i = 0; i < 4; i++) {
			rob.move(200);
			rob.turn(90);
		}
	}

	public static void drawTriangle() {
		rob.setX(60);

		rob.turn(45);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(135);
		rob.move(300);
	}

	public static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}

	public static void main(String[] args) {
		String Shape = JOptionPane.showInputDialog("What shape would you like Robot rob to draw? Rectangle, Octagon, Square, Triangle, Circle?");
		String color = JOptionPane.showInputDialog("What color do you want? Red, pink, or Green?");
		rob.penDown();

		rob.setSpeed(50);
		 if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("pink")) {
			rob.setPenColor(Color.pink);
		} else if (color.equalsIgnoreCase("Green")) {
			rob.setPenColor(Color.green);
		}
		else { rob.setRandomPenColor();
		}

		 if (Shape.equalsIgnoreCase("octagon")) {

			rob.setX(100);
			rob.setY(400);
			for (int i = 0; i < 9; i++) {

				rob.turn(45);
				rob.move(100);
			}
		}

		else if (Shape.equalsIgnoreCase("square")) {
			drawSquare();
		}
		else if (Shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		else if (Shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}

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