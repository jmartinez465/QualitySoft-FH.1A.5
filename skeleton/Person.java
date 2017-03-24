
/**
 * Definition for Class Person
 * An object of this class stores
 * contact information for 1 individual
 * 
 * @version Draft-4 Mar 13 2017
 * @author Quang Phan
 */
public class Person implements Comparable<Person> {
//Data Members
	private String firstName, lastName, emailAddress,
				   phoneNumber, notes;
	private StreetAddress address;
//--------------------------
// Public Instance Methods
//--------------------------
	/**
	 * compares two Person object by comparing
	 * their name alphabetically
	 * @param Person object to compare
	 * @return  1 if this >  other
	 * 		   -1 if this <  other
	 * 			0 if this == other
	 */
	public int compareTo(Person other) {
		return 0;
	}
	
	/**
	 * sets address for contact
	 */
	public void readAddress() {
		System.out.println("readAddress was called");
	}	
	
	/**
	 * sets email for contact
	 */
	public void setEmail(String newEmail) {		
		System.out.println("setEmail was called");
	}
	
	/**
	 * sets first name for contact
	 */
	public void setFirstName(String newName) {
		System.out.println("setFirstName was called");
	}
	
	/**
	 * sets last name for contact
	 */
	public void setLastName(String newName) {
		System.out.println("setLastName was called");
	}
	
	/**
	 * sets notes for contact
	 */
	public void setNotes(String newNotes) {
		System.out.println("setNotes was called");
	}
	
	/**
	 * sets phone number for contact
	 */
	public void setPhone(String newPhone) {
		System.out.println("setPhone was called");
	}

	
	/**
	 * @return a string containing all 
	 * 		   the contact's information
	 */
	public String toString() {
		return 	"contact information";
	}


}
