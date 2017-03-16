/**
 * tests Class Person, StreetAddress and ContactList
 * for Use Case 1
 * @version 1 Mar 16 2017
 * @author Quang Phan
 */

import java.util.Scanner;

public class TestUseCase1 {
	private static final int MAX_CONTACT = 100;	
	private static ContactList contactBook = new ContactList(MAX_CONTACT);
	
	public static void main(String[] args) {
		for (int run = 1; run <= 3; run++) {
			contactBook.add();
			System.out.println("========LIST OF CONTACT========");
			System.out.println(contactBook.toString());
		}
	}
	
	
	/**
	 * reads the saved file into the contact list
	 * display a message if no contact is found
	 */
	public static void read() {
		//more code needed for reading file.
	}
	
	/**
	 * saves "contactBook to disk" and sets
	 * "restart" to false (to quit the program)
	 */
	public static void quit() {
		//more code needed for saving file.
	}
	
}



/*RUN
Please press enter after each input.
Last name: Smith
First name: John
Address: 
	House/Apartment: 123 Main St.
	City: San Jose
	State: CA
	Zip code: 12345
	Country: USA
Email address: john.smith@gmail.com
Phone number: 123-456-7890
Notes: Test test
New contact added!
========LIST OF CONTACT========
Smith, John
123 Main St. San Jose CA 12345 USA
john.smith@gmail.com
123-456-7890
Test test
----------------------------
Number of contacts: 1
===============================

Please press enter after each input.
Last name: 
Last name is required. No contact added!
========LIST OF CONTACT========
Smith, John
123 Main St. San Jose CA 12345 USA
john.smith@gmail.com
123-456-7890
Test test
----------------------------
Number of contacts: 1
===============================

Please press enter after each input.
Last name: Link
First name: 
Address: 
	House/Apartment: 
	City: 
	State: 
	Zip code: 
	Country: 
Email address: 
Phone number: 
Notes: 
New contact added!
========LIST OF CONTACT========
Smith, John
123 Main St. San Jose CA 12345 USA
john.smith@gmail.com
123-456-7890
Test test
----------------------------
Link, 
    



----------------------------
Number of contacts: 2
===============================

*/
