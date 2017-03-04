
/**
 * Skeleton for Class ContactList
 * Each object of this class stores a
 * contact list
 * 
 * @version Draft-1 Mar 2 2017
 * @author Quang Phan
 */
public class ContactList {
//data members
	Person[] contactList;
	
//--------------
// Constructor
//--------------
	/**
	 * Creates & allocates contactList
	 * @param size = size of contactList
	 */
	public ContactList(int size) {
	}
	
//--------------------------
// Public Instance Methods
//--------------------------
	/**
	 * adds a new person into
	 * the contact list
	 */
	public void add() {
		//If name is blank, the person will not
		//be entered into the list
		System.out.println("add was called");
	}
	
	/**
	 * quits the Contact List Program
	 * and saves to disk
	 */
	public void exit() {
		System.out.println("quit was called");
	}
	
	/**
	 * starts the Contact List Program
	 * and opens the existing data file on disk
	 * if there's no contact list data file,
	 * system starts with an empty list
	 */
	public void open() {
		System.out.println("start was called");
	}
	
	/**
	 * prints the entire contact list
	 */
	public void printList() {	
		System.out.println("printList was called");
	}
	
	/**
	 * @param last name of a person being searched
	 * searches and prints the information from
	 * the person(s) with the matched last name
	 */
	public void search(String lastName) {
		//If no one is found, display a message
		//If more than one is found, print all
		System.out.println("search was called");
	}
}
