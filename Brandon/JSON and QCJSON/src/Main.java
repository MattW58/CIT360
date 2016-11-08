// http://www.json.org
import org.quickconnectfamily.json.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            String JSONString = "{\"Name\":\"Bob\",\"Age\":\"12\"}";
            HashMap JSONList = (HashMap) JSONUtilities.parse(JSONString);
            System.out.println(JSONList);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //Happy Path, write to a file
        try{
            String Bob = "{\"Name\":\"Bob\",\"Age\":\"12\"}";
            String path = "D:\\OneDrive\\College\\SoftwareDevelopment\\GIT\\CIT360\\Brandon\\JSON and QCJSON\\JSON.txt";

            FileOutputStream fileOut = new FileOutputStream(path);

            JSONOutputStream jsonStream = new JSONOutputStream(fileOut);
            jsonStream.writeObject(Bob);
            jsonStream.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        //Happy Path, read from a file
        try{
            String path = "D:\\OneDrive\\College\\SoftwareDevelopment\\GIT\\CIT360\\Brandon\\JSON and QCJSON\\JSON.txt";

            FileInputStream fileIn = new FileInputStream(path);

            JSONInputStream jsonStreamName = new JSONInputStream(fileIn);
            String inputString = (String)jsonStreamName.readObject();
            jsonStreamName.close();
            System.out.println(inputString);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        // JavaBean Method
        try{
            JavaBean Ecuador = new JavaBean("Black", "Ecuador", 32);
            String EcuadorString = JSONUtilities.stringify(Ecuador);
            System.out.println(EcuadorString);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        /////////////////////////////////////////////////////////////////////
        //NASTY PATHS
        //Reg string
        try {
            String JSONString1 = "Name:Bob, Age:12";
            HashMap JSONList1 = (HashMap) JSONUtilities.parse(JSONString1);
            System.out.println(JSONList1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //empty string
        try {
            String JSONString2 = "";
            HashMap JSONList2 = (HashMap) JSONUtilities.parse(JSONString2);
            System.out.println(JSONList2);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //null string
        try {
            String JSONString3 = "null";
            HashMap JSONList3 = (HashMap) JSONUtilities.parse(JSONString3);
            System.out.println(JSONList3);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}