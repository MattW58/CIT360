// http://www.java-samples.com/showtutorial.php?tutorialid=369
import java.util.*;

public class Col_HashMap {
    public static void main(String[] args){
        HashMap demoHashMap = new HashMap();

        demoHashMap.put("Shepard", "Commander");
        demoHashMap.put("Tali", "Tactical");
        demoHashMap.put("Joker", "Flight Lieutenant");
       // demoHashMap.put("Garrus");
       // demoHashMap.add("Adding item to a HashMap");

        System.out.println(demoHashMap);

        demoHashMap.remove("Shepard");
        demoHashMap.remove("NonexistentItem");
        //demoHashMap.delete("Wrong command");
    }
}