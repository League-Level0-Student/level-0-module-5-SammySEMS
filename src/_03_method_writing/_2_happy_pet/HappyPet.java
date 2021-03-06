package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String answer = JOptionPane.showInputDialog("What kind of pet do you want to buy? A dog, cat or bunny!");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy, food and water, take a walk, or clean up poop.", "Happy pet!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food and water", "Take a walk", "Clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			int tasks = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy, Groom, Park, or Cuddle", "Happy pet!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Groom", "Cuddle", "Park" }, null);
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
JOptionPane.showMessageDialog(null, "Looks like you love your pet!");
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}