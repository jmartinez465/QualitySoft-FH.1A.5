/**
 * tests Class Person, StreetAddress and ContactList
 * for Use Case 1 (add contacts to Contact list)
 * @version 1 Mar 16 2017
 * @author Quang Phan
 */

public class UseCaseTester {
	private static final int MAX_CONTACT = 100;	
	private static ContactList contactBook = new ContactList(MAX_CONTACT);
	
	public static void main(String[] args) {
		for (int run = 1; run <= 3; run++) {
			contactBook.add();
			System.out.println("========LIST OF CONTACT========");
			System.out.println(contactBook.toString());
		}
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
