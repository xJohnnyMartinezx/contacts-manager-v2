import java.util.Scanner;

public class ContactsMenu {


    public void userChoice() {
        Scanner sc = new Scanner(System.in);

        int userSelection = sc.nextInt();
        boolean continueRunning = true;

        do {
            System.out.println("Please make a selection from the list below...");
            System.out.println("0 - exit");
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact.");
            System.out.println("3 - Search a contact by name.");
            System.out.println("4 - Delete an existing contact.");

            System.out.println("Enter a choice: ");

            switch (userSelection) {
                case 0:
                    System.out.println("OK, bye Felicia!");
                    continueRunning = false;

                case 1:
                    System.out.println("Viewing all contacts");

                    break;
                case 2:
                    System.out.println("Adding a new contact");

                    break;
                case 3:
                    System.out.println("Searching contact");

                    break;
                case 4:
                    System.out.println("Delete an existing contact.");

                    break;

                default:
                    System.out.println("that's not an option");
            }
        } while (continueRunning);
        System.out.println("Program Shutdown");
    }
}
