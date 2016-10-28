// http://www.java-samples.com/showtutorial.php?tutorialid=370

import java.util.*;

public class Col_TreeSetOrMap {
    public static void main(String[] args){
        TreeMap demoTreeMap = new TreeMap();

        demoTreeMap.put("Shepard", "Commander");
        demoTreeMap.put("Tali", "Tactical");
        demoTreeMap.put("Joker", "Flight Lieutenant");
//        demoTreeMap.add("Adding to a treeMap");

        try {
            demoTreeMap.put((String) null, "Bob");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(demoTreeMap);

        System.out.println("Shepard killed in battle");
        demoTreeMap.remove("Shepard");
//        demoTreeMap.delete("NonExistent Item");
        System.out.println(demoTreeMap);

        System.out.println("Promote Joker to 'Flight Captain'");
        demoTreeMap.put("Joker", "Flight Captain");
        System.out.println(demoTreeMap);
    }
}