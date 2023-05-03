import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Writer {

//    ********** "MAIN METHOD" I HAVE IT HERE BUT SHOULD BE INSIDE YOUR RUNNER CLASS ***********
    public static void main(String[] args) {

        Writer init = new Writer();
        init.searchForContact();

    }
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
            int userPhone = sc.nextInt();

            bw.write(userName + ":" + userPhone);
            bw.newLine();

        }catch (Exception e){
            System.out.println("error");
        }
    }
    //    ***********************************************************************************************

    //    ********************************** SEARCH FOR CONTACT METHOD *************************************
    public HashMap<String, Contact> searchForContact() {
        HashMap<String, Contact> map = new HashMap<>();
//        vvv DECLARING THIS OUTSIDE OF TRY CATCH TO CLOSE br LATER
        BufferedReader br = null;
        try {

            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader("src/data/contactsList.txt"));

            String line = null;

            // read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);

//                PROMPTING THE USER
                System.out.println("Enter a contacts name:");
                String userInput = sc.nextLine();
                for (Contact person : map.values()) {
                    if (person.getFirstName().contains(userInput)) {
                        System.out.println(person.getFirstName() + " : " + person.getPhoneNumber());
                    }

                }
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


}
