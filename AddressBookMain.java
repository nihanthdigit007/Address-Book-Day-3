import java.util.*;
public  class AddressBookMain  {
    Scanner input = new Scanner(System.in);
    public void addDetails(ArrayList<Contact> contacts ) {
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        System.out.println("Enter City: ");
        String city = input.nextLine();
        System.out.println("Enter State: ");
        String state = input.nextLine();
        System.out.println("Enter zip: ");
        String zip = input.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Enter Email: ");
        String email = input.nextLine();
        contacts.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
    }
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");
        Scanner input = new Scanner(System.in);
        Method method = new Method();
        ArrayList<Contact> contacts = new ArrayList<>();
        char ch;
        do{
            System.out.println("1. Adding person's data.");
            System.out.println("2. Editing person's data.");
            System.out.println("3. Deleting person's data.");
            System.out.println("4. Display person's data.");
            System.out.println("5. Want to Create Another Address Book.");
            System.out.println("6. Exit.");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch(choice){
                case 1: method.addDetails(contacts );
                    break;
                case 2: method.editDetails(contacts );
                    break;
                case 3: method.deleteDetails(contacts);
                    break;
                case 4:
                    for(Contact c:contacts){
                        c.displayDetails();
                    }
                    break;
                case 5:
                    do{
                        System.out.println("1. Adding person's data.");
                        System.out.println("2. Editing person's data.");
                        System.out.println("3. Deleting person's data.");
                        System.out.println("4. Display person's data.");
                        System.out.println("5. Want to Create Another Address Book.");
                        System.out.println("6. Exit.");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();
                        switch(choice){
                            case 1: method.addDetails(contacts );
                                break;
                            case 2: method.editDetails(contacts );
                                break;
                            case 3: method.deleteDetails(contacts);
                                break;
                            case 4:
                                for(Contact c:contacts){
                                    c.displayDetails();
                                }
                                break;
                            case 5: System.exit(0);
                                break;
                        }
                        System.out.println("Do you want to continue: If yes then enter y else enter n");
                        ch=input.next().charAt(0);
                    }while(ch=='y');
                case 6: System.exit(0);
                    break;
            }
            System.out.println("Do you want to continue: If yes then enter y else enter n");
            ch=input.next().charAt(0);
        }while(ch=='y');
    }
}