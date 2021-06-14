package _99_extra;

import javax.swing.JOptionPane;

public class Modulo {

	// binary operator
	// + - * /
	// 5+10 -> 15
	// 5/3 -> 1 (R2)
	// 5%3 -> 2

	/*
	 * 
	 * 1. Is it divisible?!
	 * 
	 * x divisible 5
	 * 
	 */

	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog("enter a number");
		int num = Integer.parseInt(number);

		if (num % 5 == 0) {
			System.out.println("Divisible!");
		} else {
			System.out.println("not divisible :(");
		}
		
		/*
		 
		 2. Alternate behaviors 
		 */
		
		for (int i = 0; i < 10; i++) {
			if(i%3==0) {
				System.out.println("ello");
			}
			else if(i%3==1) {
				System.out.println("squirrel");
			}
			else {
				System.out.println("goodbye");
			}
		}
		
		
		String s = "hello";
		int i = 0; 
		
		double money = 5.45; 
		
		boolean canSwim = false; 
		boolean canFly = true;
		
		char firstInitial = s.charAt(0);
		
	
		
	}
	
	

	
}
