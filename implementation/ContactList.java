/**
 * Definition for Class ContactList
 * Each object of this class stores a
 * contact list
 * 
 * @version 2 Mar 16 2017
 * @author Quang Phan
 */

import java.util.Scanner;

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
		contactList = new Person[size];
		counter = 0;
	}
	
//--------------------------
// Public Instance Methods
//--------------------------
	/**
	 * @return "counter": the number of contacts existing
	 */
	public int getCounter() {
		return counter;
	}
	
	/**
	 * adds a new "Person" object into "contactList"
	 * and add 1 to "counter"
	 */
	public void add() {
		//If name is blank, the person will not
		//be entered into the list
		contactList[counter] = new Person();
		
		Scanner console = new Scanner(System.in);
		console.useDelimiter(System.getProperty("line.separator"));
		
		System.out.println("Please press enter after each input.");
		System.out.print("Last name: ");
		String tempName = console.nextLine();
		
		//check if user enters a blank last name:
		if (!tempName.trim().isEmpty()) { 
			contactList[counter].setLastName(tempName.trim());
		} else {
			System.err.println("Last name is required. No contact added!");
			return;
		}
		
		System.out.print("First name: ");
		contactList[counter].setFirstName(console.nextLine().trim());

		contactList[counter].readAddress();
		
		System.out.print("Email address: ");
		contactList[counter].setEmail(console.nextLine().trim());
		System.out.print("Phone number: ");
		contactList[counter].setPhone(console.nextLine().trim());
		System.out.print("Notes: ");
		contactList[counter].setNotes(console.nextLine().trim());
		
		System.out.println("New contact added!");
		counter++;
	}
	
	/**
	 * @param last name of a person being searched
	 * searches and prints the information from
	 * the person(s) with the matched last name
	 */
	public void search(String lastName) {
		//If no one is found, display a message
		//If more than one is found, print all
		//code needed for Use Case 3
	}
	
	/**
	 * @return a String containing the number of contacts
	 * in the list and all the contacts' information.
	 */
	public String toString() {
		String allInformation = "";
		for (int index = 0; index < counter; index++) {
			allInformation = allInformation + contactList[index].toString() 
					+ "\n----------------------------\n";
		}
		
		allInformation = allInformation	+ "Number of contacts: " + counter;
		return allInformation + "\n===============================\n";
	}
	
}
