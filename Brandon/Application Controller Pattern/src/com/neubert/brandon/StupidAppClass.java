package com.neubert.brandon;

import java.util.Scanner;
import com.doing.more.java.ApplicationController;

public class StupidAppClass {
	private ApplicationController theController = new ApplicationController();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create an instance of this class
		StupidAppClass theStupidApp = new StupidAppClass();

		// Map a command to execute a handler
		//Map the class instance "theStupidApp" created above to  
		theStupidApp.theController.mapCommand("ShowStuff", new PowerPropulsionDisplayHandler());
		theStupidApp.theController.mapCommand("DoTrash", new TakeOutTheTrashHandler());

		//Input a command

		System.out.println("Your wish is my command. (ShowStuff/DoTrash)");
		theStupidApp.theController.handleRequest(input.next(), null);
	}
}