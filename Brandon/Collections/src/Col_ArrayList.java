// http://www.java-samples.com/showtutorial.php?tutorialid=234

import java.util.ArrayList;
import java.util.Scanner;

public class Col_ArrayList {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userInput = "yes";
        //Create an array list
        ArrayList Roster = new ArrayList();
        System.out.println("The size of 'Roster' is: " + Roster.size());


        //Add items to ArrayList
        Roster.add("Pumpkins");
        Roster.add(16);
        Roster.add(128.67);
        Roster.add("Witches and junk");
        Roster.add(null);
        //Roster.put("Trying to put into an ArrayList");


        System.out.println();
        System.out.println();
        System.out.println("After your additions, Roster is: " + Roster.size());
        System.out.println("The contents are: " + Roster);
        System.out.println();
        System.out.println();


        //Remove items from ArrayList
        Roster.remove("Pumpkins");
        //Remove non-existing item from ArrayList
        Roster.remove("Wizards");
        Roster.remove(null);


        System.out.println("The items are:");
        System.out.println(Roster);
    }
}