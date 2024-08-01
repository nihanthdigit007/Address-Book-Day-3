import java.util.ArrayList;
import java.util.Scanner;
public class Method extends AddressBookMain{
    Scanner input = new Scanner(System.in);
    public void editDetails(ArrayList<Contact> contacts ) {
        int k = 0;
        System.out.println("Enter the person first  name to edit their contact details: ");
        String editPerson = input.nextLine();
        for (Contact c : contacts) {
            if (editPerson.equals(c.firstName)) {
                k = 1;
                System.out.println("Enter the field you want to edit: first / last/ address/ city/ state/ zip/ number/ email ");
                String field = input.nextLine();
                switch (field) {
                    case "first":
                        System.out.println("Enter First Name: ");
                        c.firstName = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                    case "last":
                        System.out.println("Enter Last Name: ");
                        c.lastName = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                    case "address":
                        System.out.println("Enter Address: ");
                        c.address = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                    case "city":
                        System.out.println("Enter City: ");
                        c.city = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                    case "state":
                        System.out.println("Enter State: ");
                        c.state = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                    case "zip":
                        System.out.println("Enter zip: ");
                        c.zip = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                    case "number":
                        System.out.println("Enter Phone Number: ");
                        c.phoneNumber = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                    case "email":
                        System.out.println("Enter Email: ");
                        c.email = input.nextLine();
                        System.out.println("Completed editing person details. ");
                        c.displayDetails();
                        break;
                }

            }
        }
        if (k == 0) System.out.println("Invalid! Entered person is not present in the address book.");
    }
    public  void deleteDetails(ArrayList<Contact> contacts ) {
        System.out.println("Enter person First name to delete the person");
        String deletePerson = input.nextLine();
        for (Contact c : contacts) {
            if (deletePerson.equals(c.firstName)) {
                c.firstName = null;
                c.lastName=null;c.address=null;c.city=null;c.email=null;
                c.zip=null;c.state=null;c.phoneNumber=null;
            }
        }
    }
}