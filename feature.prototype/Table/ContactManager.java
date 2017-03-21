/**
 * full skeleton for all use cases
 * @version 2 Mar 16 2017
 * @author Quang Phan
 */

import java.util.Scanner;

public class ContactManager {
	private static boolean restart = true;
	private static final int MAX_CONTACT = 100;	
	private static ContactList contactBook = new ContactList(MAX_CONTACT);
	
	public static void main(String[] args) {		
		read();
		
		do {
			printMenu();
			executeAction();
		} while (restart);
	}
	
	
	/**
	 * reads the saved file into "contactBook"
	 * and display a message
	 */
	public static void read() {
		//more code needed for reading file.
	}
	
	/**
	 * prints the menu
	 */
	public static void printMenu() {
		System.out.println("Greetings!");
		System.out.println(contactBook.getCounter() 
							+ " contact(s) found.");
		System.out.println("What would you like to do?");
		System.out.println("[1] Add a contact");
		System.out.println("[2] Print contacts");
		System.out.println("[3] Search by last name");
		System.out.println("[4] Quit");
	}
	
	/**
	 * executes user's choice of action
	 * @param user's choice
	 */
	public static void executeAction() {
		boolean inputAgain;
		Scanner console = new Scanner(System.in);
		String choice;
		do {
			choice = console.nextLine();
			inputAgain = false;
			switch (choice) {
				case "1": 
					addContact();
					break;
				case "2": 
					printContacts();					
					break;	
				case "3":
					searchContacts();
				case "4":
					save();
					restart = false; //terminates program
					break;
				default: 
					inputAgain = true;
					System.err.println("Wrong input. "
									+ "Please input only 1 or 2");
			}
		} while (inputAgain);
	}
	
	/**
	 * adds a contact
	 */
	public static void addContact() {
		System.out.println("===============================");
		contactBook.add();
		System.out.println("========LIST OF CONTACT========");
		System.out.println(contactBook.toString());
	}
	
	/**
	 * prints all the contacts in "contactBook"
	 */
	public static void printContacts() {
		//Use Case 2
		//code needed for printing
		Table.printTop();
		int numberOfContacts = contactBook.getCounter();
		for (int index = 0; index < numberOfContacts; index++) {
			Table contactToPrint = new Table(contactBook.getContact(index), index);
			contactToPrint.printContact();
			if (index < numberOfContacts - 1) {
				Table.printSeparator();
			} else {
				Table.printBottom();
			}
		}
		
	}
	
	/**
	 * searches contacts in "contactBook" by lastName
	 */
	public static void searchContacts() {
		//Use Case 3
		//code needed for searching
	}
	
	/**
	 * saves "contactBook" to disk and sets
	 */
	public static void save() {
		//Use Case 4
		//code needed for saving file
	}
	
}



/*RUN

*/
