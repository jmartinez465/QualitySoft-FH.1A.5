/**
 * Definition for Class ContactList
 * Each object of this class stores a
 * contact list
 * 
 * @version 3 Mar 21 2017
 * @author Quang Phan
 */

import java.util.Arrays;
import java.util.Scanner;

public class ContactList {
//data members
	private Person[] contactList;
	private int contactCounter;
	
//--------------
// Constructor
//--------------
	/**
	 * Creates & allocates contactList
	 * @param size = size of contactList
	 */
	public ContactList(int size) {
		contactList = new Person[size];
		contactCounter = 0;
	}
	
//--------------------------
// Public Instance Methods
//--------------------------
	/**
	 * @return "counter": the number of contacts existing
	 */
	public int getContactCounter() {
		return contactCounter;
	}
	
	/**
	 * adds a new "Person" object into "contactList"
	 * and add 1 to "counter"
	 */
	public void addContact() {
		if (contactCounter == contactList.length) {
			System.err.println("Maximum contacts reached. "
								+ "No more contact can be added");
		return;
		}
		
		readContactInfo();	
	}
	
	/**
	 * reads in contact's information from user
	 */
	private void readContactInfo() {
		Scanner console = new Scanner(System.in);
		Person tempPerson = new Person();
		String stringInput;
		
		System.out.println("Please press enter after each input, or "
							+ "input only 'c' to cancel.");
		System.out.print("Last name: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else if (tempName.isEmpty()) { //terminates if last name is blank
			System.err.println("Last name is required. No contact added!");
			return;
		} else {
			tempPerson.setLastName(tempName);
		}
		
		System.out.print("First name: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else if (tempName.isEmpty()) { //terminates if first name is blank
			System.err.println("First name is required. No contact added!");
			return;
		} else {
			tempPerson.setLastName(tempName);
		}
		
		
		StreetAddress address = new StreetAddress();
		System.out.println("Address: ");
		System.out.print("\tHouse/Apartment: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			address.setHouse(tempName);
		}
		
		System.out.print("\tCity: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			address.setCity(tempName);
		}
		
		System.out.print("\tState: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			address.setState(tempName);
		}
		
		System.out.print("\tZip code: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			address.setZip(tempName);
		}
		
		System.out.print("\tCountry: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			address.setCountry(tempName);
			tempPerson.setAddress(address);
		}
			
		System.out.print("Email address: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			tempPerson.setEmail(tempName);
		}
		
		System.out.print("Phone number(XXX XXX XXXX): ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			tempPerson.setPhone(tempName);
		}
	
		System.out.print("Notes: ");
		tempName = console.nextLine().trim();
		if (isCancelled(tempName)) { //terminates if user enters "c"
			System.out.println("No contact added.");
			return;
		} else {
			tempPerson.setNotes(tempName);
		}
		
		contactList[contactCounter] = tempPerson;
		System.out.println("New contact added!");
		contactCounter++;
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
	 * sorts the contact list in ascending alphabetical order
	 * with respects to last name
	 * 2 contacts with the same last name will be ordered by
	 * first name 
	 */
	public void sort() {
		Arrays.sort(contactList, 0, contactCounter);
	}
	
	/**
	 * 
	 * @param index of the contact of interest
	 * @return the contact as a "Person" type
	 */
	public Person getContact(int index) {
		return contactList[index];
	}
	
	/**
	 * @return a String containing the number of contacts
	 * in the list and all the contacts' information.
	 */
	public String toString() {
		String allInformation = "";
		for (int index = 0; index < contactCounter; index++) {
			allInformation = allInformation + contactList[index].toString() 
					+ "\n----------------------------\n";
		}
		
		allInformation = allInformation
					+ "Number of contacts: " + contactCounter;
		return allInformation 
				+ "\n===============================\n";
	}	
}
