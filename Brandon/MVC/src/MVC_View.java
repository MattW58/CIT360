/*The definition of View code we'll use is "Any code that is used to
communicate with the user OR ANY OTHER COMPUTING SYSTEM
requesting or sending data ( this is IO code not part of the
model)." Lots of people new to software development seem to get
the idea that View code only consists of what the user sees. OK.
What is a user? Does a user have to be human? Nope.*/

import java.util.Scanner;

public class MVC_View {
	public static void main(String[] args){

        MVC_Controller theController = new MVC_Controller();


		Scanner input = new Scanner(System.in);
		String userInput;
		
		System.out.println("How many gummy bears do you have? ");
		theController.startGummyBear(input.nextInt());

		while (theController.theModel.getSimpleGummyBearCount() != 0) {
			System.out.println("Did you eat or gain any gummy bears? (eat/gain)");
			userInput = input.next();
			
			if (userInput.equals("eat")){
				System.out.println("How many did you eat? ");
				theController.eatGummyBear(input.nextInt());
				System.out.println("You now have " + theController.theModel.getSimpleGummyBearCount());
			}
			else if (userInput.equals("gain")){
				System.out.println("how many did you gain? ");
				theController.gainGummyBear(input.nextInt());
				System.out.println("You now have " + theController.theModel.getSimpleGummyBearCount());
			}
			else {
				System.out.println("That is not a valid input.");
			}
		}
		System.out.println("You are out of gummy bears :("); 
	}
}