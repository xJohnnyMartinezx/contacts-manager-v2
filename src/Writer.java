import java.io.*;
import java.util.*;

public class Writer {

//    ********** "MAIN METHOD" I HAVE IT HERE BUT SHOULD BE INSIDE YOUR RUNNER CLASS ***********
    public static void main(String[] args) {

        Writer init = new Writer();
//        init.searchForContact();
//        init.addContact();
//        init.deleteContact();
        init.showMap();

    }
    HashMap<String, String> map = new HashMap<>();
//    ***********************************************************************************************

//    ******************************** SCANNER ****************************************
    Scanner sc = new Scanner(System.in);
    //    ***********************************************************************************************
    public void showMap(){
        System.out.println(map);
    }




    //    *************************** ADD CONTACT METHOD***************************************************
    public void addContact(){
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/data/contactsList.txt", true));
            System.out.println("enter a name: ");
            String userName = sc.nextLine();
            System.out.println("enter a phone number");
            String userPhone = sc.nextLine();
            map.put(userName,userPhone);

            // iterate map entries
            for (Map.Entry<String, String> entry : map.entrySet()) {

                // put key and value separated by a colon
                bw.write(entry.getKey() + ":"
                        + entry.getValue());

                // new line
                bw.newLine();
            }

            bw.flush();

            System.out.println("Would you like to enter another?");
            String userContinue = sc.nextLine();
            if (userContinue.equalsIgnoreCase("y")){
                addContact();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {

                // always close the writer
                bw.close();
            }
            catch (Exception e) {
            }
        }
        System.out.println("line 83: " + map);
    }
    //    ***********************************************************************************************

    //    ********************************** SEARCH FOR CONTACT METHOD *************************************

    public void searchForContact() {
        try {

            // create BufferedReader object from the File
           BufferedReader br = new BufferedReader(new FileReader("src/data/contactsList.txt"));
//

//                PROMPTING THE USER
                System.out.println("Enter a contacts name:");
                String userInput = sc.nextLine();
            String contents;

            while ((contents = br.readLine()) != null) {
                if (contents.contains(userInput)) {
                    System.out.println(contents);
                }
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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

    public void deleteContact() {


        }
    }



