/*That leaves us needing a definition for Control. Here is one I like.
"Control code is the smarts of the application. If a decision is being
made, it's Control code. If data is being manipulated, statistics calculated,
strings assembled, etc., its Control code."*/

public class MVC_Controller {

    private MVC_JB_Model theModel = new MVC_JB_Model();

	public void startGummyBear(int amount){

        theModel.setSimpleGummyBearCount(amount);
	}
	public void gainGummyBear(int amount){
		theModel.setSimpleGummyBearCount(theModel.getSimpleGummyBearCount() + amount);
	}
	public void eatGummyBear(int amount) {
		if (amount > theModel.getSimpleGummyBearCount()){
			System.out.println("You don't have that many gummy bears. Did you lie to me?");	
		}
		else {
			theModel.setSimpleGummyBearCount(theModel.getSimpleGummyBearCount() - amount);
		}
	}
}