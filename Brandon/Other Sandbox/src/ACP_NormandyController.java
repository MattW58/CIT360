//THIS WAS WRITTEN VIA USE OF THREADS. NON FUNCTIONAL.

//YOU NEED TO FIGURE OUT HOW TO CALL MULTIPLE METHODS 
//ON MULTIPLE THREADS AT THE SAME TIME. THE GOAL IS TO CALL
// THE DATA WITHIN JB_NORMANDY SIMULTANIOUSLY.

import java.util.Scanner;


//APPLICATION
public class TER_GoodRunnable extends Thread{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("----------- Welcome to the SSV Normandy -----------");
		System.out.println("Perform Which Diagnostic?");
		System.out.println("1: All Systems Check");
		System.out.println("2: Power and Propulsion");
		System.out.println("3: AI Computer");
		System.out.println("4: Defense Systems");
		System.out.println("5: Weapons Systems");

//THIS LINE IS FOR APPLICATION CONTROLLER PATTERN.		
		ACP_NormandyController.handleRequest(input.nextInt());
	
	}

//CONTROLLER FUNCTIONS
		public static void AllSys(){
			System.out.println("Performing full systems diagnosis.");
			
			PowerAndPropulsion();
			AI();
			DefenseSystems();
			WeaponsSystems();
		}
		
		public static void PowerAndPropulsion() {
			System.out.println("Power and Propulsion:");
			TER_GoodThread driveCoreCk = new TER_GoodThread();
			TER_GoodThread fuelCellsCap = new TER_GoodThread();
			TER_GoodThread lifeSupportCk = new TER_GoodThread();
			driveCoreCk.start();
			fuelCellsCap.start();
			lifeSupportCk.start();
		}
		public static void AI(){
			System.out.println("Normandy AI:");
			TER_GoodThread ediCk = new TER_GoodThread();
			ediCk.start();
		}
		public static void DefenseSystems(){
			System.out.println("Defense Systems:");
			TER_GoodThread kineticBarrierCk = new TER_GoodThread();
			TER_GoodThread cloakCap = new TER_GoodThread();
			kineticBarrierCk.start();
			cloakCap.start();
		}
		public static void WeaponsSystems(){
			System.out.println("Weapons Systems:");
			TER_GoodThread javelinTorpedoCt = new TER_GoodThread();
			TER_GoodThread javelinTorpedoArm = new TER_GoodThread();
			TER_GoodThread thanixCanonCk = new TER_GoodThread();
			TER_GoodThread gardianLaserCk = new TER_GoodThread();
			javelinTorpedoCt.start();
			javelinTorpedoArm.start();
			thanixCanonCk.start();
			gardianLaserCk.start();
		}
	}


// THIS IS A SAMPLE CLASS POSSIBLY TO USE A CLASS TO CALL METHODS.
public class ACP_NormandyController {

	public static void UserOption(int option){
		if (option == 1){
			TER_GoodThread.AllSys();
			TER_GoodThread.PowerAndPropulsion();
			TER_GoodThread.AI();
			TER_GoodThread.DefenseSystems();
			TER_GoodThread.WeaponsSystems();
		}
	}
}