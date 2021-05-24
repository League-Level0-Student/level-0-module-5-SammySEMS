package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	
	
	SkillPractice skills = new SkillPractice();
    skills.skill1();
    skills.skill2();
    skills.skill3();
    skills.skill4();
    //skills.skill5();
}

void skill1() {
//Use pop-ups for the following.
//Ask the user how many dimes they have
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int cents = Integer.parseInt(dimes);
	



//Tell them how many cents they have (hint multiply by 10)
System.out.println("You have " + cents*10 + " cents ");




//Ask the user how tall they are (inches)

	String tall = JOptionPane.showInputDialog("How tall are you in inches?");
	double howtall = Integer.parseInt(tall);

//If they are shorter than 36 inches, tell them to eat their Wheaties
	
	if(howtall<36) {
		JOptionPane.showMessageDialog(null, "You need to eat you Wheaties");

	}

}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console
	for (int i = 0; i < 20; i++)  {
	if (i%3==0) {
		System.out.println(i);

	}
	}
}
void skill3() { // Get a random number that is less than 20 and print it to the console

Random rob = new Random();
int number = rob.nextInt(21);

//Get another random number that is less than 10 and print it to the console
int number2 = rob.nextInt(11);


//Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
System.out.println(number-number2);


}

void skill4() { // In a pop-up, ask the user for the city they live in



//If they answered "San Diego", tell them they live in America's Finest City

	String city=JOptionPane.showInputDialog("What city do you live in?");
	if (city.equalsIgnoreCase("san diego")) {
		JOptionPane.showMessageDialog(null, "You live in America's finest city");
	}
	

//Otherwise, tell them to move to San Diego

		else {
		JOptionPane.showMessageDialog(null, "You should move to San Diego");
//Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
		int car1 = 4;
	int cars;
	String Ncars =JOptionPane.showInputDialog("How many cars does your family have?");
	int NCars = Integer.parseInt(Ncars);
	if(NCars==0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transporation");
	}
	//If there is 1 car, use a pop-up to display the make/model of the car
	else if (NCars==1) {
		
	}
	
	//If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
	else  {
		System.out.println(NCars-car1);
		}
		}
		
	
		
		}	
	


}
	

