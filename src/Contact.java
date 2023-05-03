import java.util.HashMap;

public class Contact {

//    ***** PROPERTIES
    public String firstName;
    public int phoneNumber;

//    public HashMap<String, Integer> contactsList;

//    ***** CONSTRUCTOR

    public Contact(String firstName, int phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }


//    ***** GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
