import java.io.Serializable;

/*Let's define Model first. It seems to be the easiest for people to
agree on. How about "The model is the data, a representation of
the data, and code that hides how the data is accessed and stored." */

public class MVC_JB_Model implements Serializable{

	int SimpleGummyBearCount;

	public MVC_JB_Model(){
	}
	public int getSimpleGummyBearCount(){
		return SimpleGummyBearCount;
	}
	public void setSimpleGummyBearCount(int amount) {
		this.SimpleGummyBearCount = amount;
	}
}