package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {

		int number1 = 0;
		int number2 = 1;
		int sum;

		System.out.println(number1);
		System.out.println(number2);

		for (int i = 0; i < 20; i++) {
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;

			System.out.println(number2);

		}
	}

}
