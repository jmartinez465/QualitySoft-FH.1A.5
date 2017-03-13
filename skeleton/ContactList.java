
/**
 * Definition for Class ContactList
 * Each object of this class stores a
 * contact list
 * 
 * @version Draft-4 Mar 13 2017
 * @author Quang Phan
 */
public class ContactList {
//data members
	private Person[] contactList;
	private int counter;
	
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
	 * adds a new "Person" object into "contactList"
	 * and add 1 to "counter"
	 */
	public void add() {
		//If name is blank, the person will not
		//be entered into the list
		System.out.println("add was called");
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
