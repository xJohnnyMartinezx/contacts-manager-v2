import javax.crypto.interfaces.PBEKey;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Writer {

//    ********** "MAIN METHOD" I HAVE IT HERE BUT SHOULD BE INSIDE YOUR RUNNER CLASS ***********
    public static void main(String[] args) {

        Writer init = new Writer();
        init.searchForContact();
//        init.addContact();
//        init.deleteContact();

    }
    HashMap<String, String> map = new HashMap<>();
//    ***********************************************************************************************

//    ******************************** SCANNER ****************************************
    Scanner sc = new Scanner(System.in);
    //    ***********************************************************************************************




    //    *************************** ADD CONTACT METHOD***************************************************
    public void addContact(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/data/contactsList.txt", true))){
            System.out.println("enter a name: ");
            String userName = sc.nextLine();
            System.out.println("enter a phone number");
            String userPhone = sc.nextLine();

            bw.write(userName + ":" + userPhone);
            bw.newLine();

        }catch (Exception e){
            System.out.println("error");
        }
    }
    //    ***********************************************************************************************

    //    ********************************** SEARCH FOR CONTACT METHOD *************************************

    public HashMap<String, String> searchForContact() {
//        HashMap<String, Contact> map = new HashMap<>();
//        vvv DECLARING THIS OUTSIDE OF TRY CATCH TO CLOSE br LATER
        System.out.println(map);
        BufferedReader br = null;
        try {

            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader("src/data/contactsList.txt"));

            String line = null;

            // read file line by line
            while ((line = br.readLine()) != null) {
//

//                PROMPTING THE USER
                System.out.println("Enter a contacts name:");
                String userInput = sc.nextLine();
//                for (Map.Entry<String, String> person : map.entrySet()) {
                    if (map.containsKey(userInput)) {
//                        System.out.println(map.getKey() + " : " + map.getValue());
                    }

//                }
                System.out.println(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                };
            }
        }

        return map;
    }

//    public void reader(){
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("src/data/contactsList.txt"));
//            String contents;
//
//            while ((contents = br.readLine()) != null) {
//                System.out.println(contents);
//            }
//            br.close();
//
//        } catch (Exception e) {
//            return;
//        }
//    }

//    public void deleteContact() {
//        System.out.println(map);
//        boolean done = false;
//        System.out.println("Enter a contact to delete:");
//        String userInput = sc.nextLine();
////            if (map.containsKey(userInput)) {
////                map.remove
//////                System.out.println(key);
////            }
//
//
//
//            try {
//                BufferedReader currMap = new BufferedReader(new FileReader("src/data/contactsList.txt"));
//
//                for (Map.Entry<String, String> person : currMap.entrySet())
//                    if (map.containsKey(userInput)) {
//
//                        map.remove(person.getKey());
//                        map.remove(person.getValue());
////                System.out.println(key);
//                    }
//
//
////                BufferedWriter bw = new BufferedWriter(new FileWriter("src/data/contactsList.txt"));
////                bw.write(String.valueOf(map));
////                bw.close();
//                done = true;
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            if (done == true) {
//                System.out.println("Success");
//            }
//
//        }
    }



