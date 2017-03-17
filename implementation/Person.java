/**
 * Definition for Class Person
 * An object of this class stores
 * contact information for 1 individual
 * 
 * @version 2 Mar 16 2017
 * @author Quang Phan
 */
import java.util.Scanner;

public class Person implements Comparable<Person> {
//Data Members
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private String notes;
	private StreetAddress address;
//--------------------------
// Public Instance Methods
//--------------------------

	/**
	 * sets first name for contact
	 */
	public void setFirstName(String newName) {
		firstName = newName;
	}
	
	/**
	 * sets last name for contact
	 */
	public void setLastName(String newName) {
		lastName = newName;
	}
	
	/**
	 * calls methods from address of type StreetAddress
	 * to reads in address information for contact
	 */
	public void readAddress() {
		address = new StreetAddress();
		
		Scanner console = new Scanner(System.in);
		console.useDelimiter(System.getProperty("line.separator"));
		
		System.out.println("Address: ");
		System.out.print("\tHouse/Apartment: ");
		address.setHouse(console.nextLine().trim());
		System.out.print("\tCity: ");
		address.setCity(console.nextLine().trim());
		System.out.print("\tState: ");
		address.setState(console.nextLine().trim());
		System.out.print("\tZip code: ");
		address.setZip(console.nextLine().trim());
		System.out.print("\tCountry: ");
		address.setCountry(console.nextLine().trim());
	}	
	
	/**
	 * sets email for contact
	 */
	public void setEmail(String newEmail) {		
		emailAddress = newEmail;
	}
	
	/**
	 * sets phone number for contact
	 */
	public void setPhone(String newPhone) {
		phoneNumber = newPhone;
	}	
	
	/**
	 * sets notes for contact
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}
	
	/**
	 * @return contact's last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * compares two Person object by comparing
	 * their name alphabetically
	 * @param Person object to compare
	 * @return  1 if this >  other
	 * 		   -1 if this <  other
	 * 			0 if this == other
	 */
	public int compareTo(Person other) {
		//code needed for String comparison
		return 0;
	}

	/**
	 * @return a string containing all 
	 * 		   the contact's information
	 */
	public String toString() {
		return 	lastName + ", " + firstName
				+ "\n" + address
				+ "\n" + emailAddress
				+ "\n" + phoneNumber
				+ "\n" + notes;
	}

}
