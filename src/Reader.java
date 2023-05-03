import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Reader {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/data/contactsList.txt"));
            String contents;

            while ((contents = br.readLine()) != null){
                System.out.println(contents);
            }
            br.close();

        }catch (Exception e){
            return;
        }
    }


}
