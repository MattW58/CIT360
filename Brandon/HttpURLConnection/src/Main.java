import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        int user_input = in.nextInt();


        switch(user_input) {
            case 1:
                //Happy Path :)
                URL Apple = new URL("http://www.apple.com/");
                URLConnection connectionName = Apple.openConnection();
                BufferedReader bufferName = new BufferedReader(new InputStreamReader(connectionName.getInputStream()));
                String a = bufferName.readLine();
                while (a != null) {
                    System.out.println(a);
                    a=bufferName.readLine();
                }
            case 2:
                //bad url
                URL AppleNasty1 = new URL("http://www.apple");
                URLConnection NastyConn1 = AppleNasty1.openConnection();
                BufferedReader NastyBuff1 = new BufferedReader(new InputStreamReader(NastyConn1.getInputStream()));
                String n1 = NastyBuff1.readLine();
                while (n1 != null) {
                    System.out.println(n1);
                    a=NastyBuff1.readLine();
                }
            case 3:
                // page doesn't exist
                URL AppleNasty2 = new URL("http://www.apple.com/GarbageThatDoesntExist");
                URLConnection NastyConn2 = AppleNasty2.openConnection();
                BufferedReader NastyBuff2 = new BufferedReader(new InputStreamReader(NastyConn2.getInputStream()));
                String n2 = NastyBuff2.readLine();
                while (n2 != null) {
                    System.out.println(n2);
                    a=NastyBuff2.readLine();
                }
            case 4:
                //don't loop the print
                URL AppleNasty3 = new URL("http://www.apple.com/");
                URLConnection NastyConn3 = AppleNasty3.openConnection();
                BufferedReader NastyBuff3 = new BufferedReader(new InputStreamReader(NastyConn3.getInputStream()));
                String n3 = NastyBuff3.readLine();
                System.out.println(n3);
                a=NastyBuff3.readLine();
        }
    }
}