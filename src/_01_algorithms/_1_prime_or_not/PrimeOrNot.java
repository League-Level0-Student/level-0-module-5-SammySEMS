package _01_algorithms._1_prime_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog(null, "Pick a number, any number!");
		int number = Integer.parseInt(n);
		
		for (int i = 2; i < number; i++) {
			System.out.println(number % i);

			if ((number % i) == 0) {
				JOptionPane.showMessageDialog(null, "The number is not prime, the number is composite. ");
				System.exit(0);
			} 
			else if(i==number-1) {
				JOptionPane.showMessageDialog(null, "The number is Prime");
			}
		}

		//JOptionPane.showMessageDialog(null, "The number is prime");
	Random rob = new Random();
	
	int num = rob.nextInt(21);
			System.out.println(rob);
		// System.out.println(5%2);

		// System.out.println(5%3);

		// System.out.println(5%4);

	}

}
