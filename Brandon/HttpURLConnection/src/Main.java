import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        System.out.println("Type a switch: ");
        int user_input = in.nextInt();

        switch(user_input) {
            case 1: //Happy Path :)
                URL Apple = new URL("http://www.apple.com/");
                URLConnection connectionName = Apple.openConnection();
                BufferedReader bufferName = new BufferedReader(new InputStreamReader(connectionName.getInputStream()));
                String a = bufferName.readLine();
                while (a != null) {
                    System.out.println(a);
                    a = bufferName.readLine();
                }
            case 2: //Missing protocol (http://)
                URL AppleNasty1 = new URL("www.apple.com");
                URLConnection NastyConn1 = AppleNasty1.openConnection();
                BufferedReader NastyBuff1 = new BufferedReader(new InputStreamReader(NastyConn1.getInputStream()));
                String n1 = NastyBuff1.readLine();
                while (n1 != null) {
                    System.out.println(n1);
                    n1 = NastyBuff1.readLine();
                }
            case 3: // page doesn't exist
                URL AppleNasty2 = new URL("http://www.apple.com/GarbageThatDoesntExist");
                URLConnection NastyConn2 = AppleNasty2.openConnection();
                BufferedReader NastyBuff2 = new BufferedReader(new InputStreamReader(NastyConn2.getInputStream()));
                String n2 = NastyBuff2.readLine();
                while (n2 != null) {
                    System.out.println(n2);
                    n2=NastyBuff2.readLine();
                }
            case 4: //don't loop the print
                URL AppleNasty3 = new URL("http://www.apple.com/");
                URLConnection NastyConn3 = AppleNasty3.openConnection();
                BufferedReader NastyBuff3 = new BufferedReader(new InputStreamReader(NastyConn3.getInputStream()));
                String n3 = NastyBuff3.readLine();
                System.out.println(n3);
                n3 = NastyBuff3.readLine();
            case 5: //Website doesn't exist
                URL Nasty5 = new URL("http://www.doesntexist4k4k4.com/");
                URLConnection NastyConn5 = Nasty5.openConnection();
                BufferedReader NastyBuff5 = new BufferedReader(new InputStreamReader(NastyConn5.getInputStream()));
                String n5 = NastyBuff5.readLine();
                while (n5 != null) {
                    System.out.println(n5);
                    n5 = NastyBuff5.readLine();
                }
            case 6: //Passing a Null
                URL Nasty6 = new URL(null);
                URLConnection NastyConn6 = Nasty6.openConnection();
                BufferedReader NastyBuff6 = new BufferedReader(new InputStreamReader(NastyConn6.getInputStream()));
                String n6 = NastyBuff6.readLine();
                while (n6 != null) {
                    System.out.println(n6);
                    n6 = NastyBuff6.readLine();
                }
            case 7: //Incorrect print
                URL Nasty7 = new URL("http://www.apple.com");
                URLConnection NastyConn7 = Nasty7.openConnection();
                BufferedReader NastyBuff7 = new BufferedReader(new InputStreamReader(NastyConn7.getInputStream()));
                String n7 = NastyBuff7.readLine();
                while (n7 == null) {
                    System.out.println(n7);
                    n7 = NastyBuff7.readLine();
                }
        }
    }
}