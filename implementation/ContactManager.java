/**
 * tests Class Person, StreetAddress and ContactList
 * for Use Case 1
 * @version 1 Mar 15 2017
 * @author Quang Phan
 */

import java.util.Scanner;

public class ContactManager {
	static boolean restart = true;
	static Scanner console = new Scanner(System.in);
	static final int MAX_CONTACT = 100;	
	static ContactList contactBook = new ContactList(MAX_CONTACT);
	
	public static void main(String[] args) {
		read();
		do {
			System.out.println("Greetings!");
			System.out.println(contactBook.getCounter() 
								+ " contact(s) found.");
			System.out.println("What would you like to do?");
			System.out.println("[1] Add a contact");
			System.out.println("[2] Quit");
			
			boolean inputAgain;
			do {
				String choice = console.next();
				inputAgain = false;
				
				switch (choice) {
					case "1": 
						System.out.println("===============================");
						contactBook.add();
						System.out.println("========LIST OF CONTACT========");
						System.out.println(contactBook.toString());
						break;
					case "2": 
						quit();
						break;
					default: 
						inputAgain = true;
						System.out.println("Wrong input. "
								+ "Please input only 1 or 2");
				}
			} while (inputAgain);

			
		} while (restart);
		
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
		restart = false;
	}
	
}



/*RUN
Greetings!
0 contact(s) found.
What would you like to do?
[1] Add a contact
[2] Quit
3
Wrong input. Please input only 1 or 2
q
Wrong input. Please input only 1 or 2
1
===============================
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
Phone number: 012-345-7689
Notes: Test test test
New contact added!
========LIST OF CONTACT========
Smith, John
123 Main St. San Jose CA 12345 USA
john.smith@gmail.com
012-345-7689
Test test test
----------------------------
Number of contacts: 1
===============================

Greetings!
1 contact(s) found.
What would you like to do?
[1] Add a contact
[2] Quit
1
===============================
Please press enter after each input.
Last name: Farius
First name: Link
Address: 
	House/Apartment: 1001 Backstreet St.
	City: San Address
	State: CA
	Zip code: 93339
	Country: USA
Email address: linkfarius@gmail.com
Phone number: 
Notes: CS major
New contact added!
========LIST OF CONTACT========
Smith, John
123 Main St. San Jose CA 12345 USA
john.smith@gmail.com

Test test test
----------------------------
Link, Farius
1001 Backstreet St. San Address CA 93339 USA
linkfarius@gmail.com
097-327-4664
CS major
----------------------------
Number of contacts: 2
===============================

Greetings!
2 contact(s) found.
What would you like to do?
[1] Add a contact
[2] Quit
1
===============================
Please press enter after each input.
Last name: Freeman
First name:  
Address: 
	House/Apartment:  
	City: 
	State: 
	Zip code: 
	Country: 
Email address:  
Phone number:  012-345-7689
Notes:  
New contact added!
========LIST OF CONTACT========
Smith, John
123 Main St. San Jose CA 12345 USA
john.smith@gmail.com
012-345-7689
Test test test
----------------------------
Link, Farius
1001 Backstreet St. San Address CA 93339 USA
linkfarius@gmail.com
097-327-4664
CS major
----------------------------
Freeman, 
    

012-345-7689

----------------------------
Number of contacts: 3
===============================

Greetings!
3 contact(s) found.
What would you like to do?
[1] Add a contact
[2] Quit
2

*/
