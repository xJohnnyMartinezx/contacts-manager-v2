import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Writer {
    public static void main(String[] args) {

        Writer init = new Writer();
//        init.addContact();
//        init.searchForContact();
    }

    Scanner sc = new Scanner(System.in);
//    HashMap<String, List<String>> contactsHashMap = new HashMap<>();
//
//        contactsHashMap.put("test1", Arrays.asList("Value1", "Value2", "Value3"));
//        contactsHashMap.put("test2", Arrays.asList("Value1", "Value2", "Value3"));
//        contactsHashMap.put("test3", Arrays.asList("Value1", "Value2", "Value3"));
//
//        InputStream userName = System.in;
//        InputStream phone = System.in;
//        public void wirte() {
//
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/data/contactsList.txt", true))) {
//                for (Map.Entry<String, List<String>> contact : contactsHashMap.entrySet()) {
//                    // put key and value separated by a colon
////                if (){
////
////                }
//                    bw.write(contact.getKey() + ":"
//                            + contact.getValue());
//
//                    // new line
//                    bw.newLine();
//                }
//
//                bw.flush();
//                bw.close();
//
//            } catch (Exception e) {
//                return;
//            }
//
//            // always close the writer
//        }

    HashMap<String, Integer> contactsHashMap = BufferedReader(new FileReader("src/data/contactsList.txt"));

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



//    public Map.Entry<String, Integer> searchForContact(){
//        System.out.println("Enter a contacts name:");
//        String userInput = sc.nextLine();
//        String name = null;
//        int number = 0;
//        for (Map.Entry<String, Integer> contact : contactsHashMap.entrySet()) {
//            if (contact.getKey().equals(userInput)){
////                System.out.println(contact.getKey());
////                System.out.println(contact.getValue());
//            }
//            name = contact.getKey();
//            number = contact.getValue();
//
//        }
//        return System.out.println(name, number);
//    }


    public HashMap<String, Contact> search(){
        System.out.println("Enter a contacts name:");
        String userInput = sc.nextLine();
        for (Contact person : contactsHashMap.values()){

        }

    }


}
