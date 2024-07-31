import java.util.ArrayList;
import java.util.Scanner;


    public class AddressBook {
        private ArrayList<Contact> contacts = new ArrayList<>();

        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        public void displayContacts() {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number of contacts: ");
            int numberOfContacts = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < numberOfContacts; i++) {
                System.out.print("First Name: ");
                String firstName = scanner.nextLine();
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                System.out.print("Address: ");
                String address = scanner.nextLine();
                System.out.print("City: ");
                String city = scanner.nextLine();
                System.out.print("State: ");
                String state = scanner.nextLine();
                System.out.print("Zip: ");
                String zip = scanner.nextLine();
                System.out.print("Phone Number: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();

                Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                addressBook.addContact(contact);
            }

            System.out.println("Contacts in Address Book:");
            addressBook.displayContacts();
        }
    }

