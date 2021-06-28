package _99_extra;

import java.util.Random;

public class Randoms {
public static void main(String[] args) {
	
Random rob = new Random();
	
	
			int high=20;
			int low=10;		
	int num = rob.nextInt(((high-low)+1)+low);
	System.out.println(num);

	int paremeter = 5;
	System.out.println(paremeter*2);
}
}
