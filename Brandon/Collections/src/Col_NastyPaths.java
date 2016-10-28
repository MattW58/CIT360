import java.util.*;

public class Col_NastyPaths {
    public static void main(String[] args) {
        HashMap NastyHash = new HashMap();

        NastyHash.put("Shepard", "Commander");
        NastyHash.put("Tali", "Tactical");
        NastyHash.put("Joker", "Flight Lieutenant");

        System.out.println(NastyHash);

        //PassingRecallingNull
        NastyHash.put(null, null);
        System.out.println(NastyHash.get(null));

        //Duplicate Value
        NastyHash.put("Shepard", "Cadet");

        //accessNonExist
        System.out.println(NastyHash.get("David"));
    }
}