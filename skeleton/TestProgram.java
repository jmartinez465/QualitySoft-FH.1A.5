/**
 * tests Class Person, StreetAddress and ContactList
 * 
 * @version Draft-4 Mar 13 2017
 * @author Quang Phan
 */
public class TestProgram {
	public static void main(String[] args) {
		read();
		
		ContactList list = new ContactList(5);
		list.add();
		list.printList();
		list.search("");
		
		StreetAddress address = new StreetAddress();
		address.setCity("");
		address.setCountry("");
		address.setHouse("");
		address.setState("");
		address.setZip("");
		System.out.println(address.toString());
		
		Person contact = new Person();
		Person test = new Person();
		System.out.println(contact.compareTo(test));
		contact.readAddress();
		contact.setEmail("");
		contact.setFirstName("");
		contact.setLastName("");
		contact.setNotes("");
		contact.setPhone("");
		System.out.println(contact.toString());
		
		
	}
	
	
	/**
	 * reads the saved file into the contact list
	 * display a message if no saved file is found
	 */
	public static void read() {
		System.out.println("read was called");
	}
	
}



/*RUN
read was called
add was called
printList was called
search was called
setCity was called
setCountry was called
setHouse was called
setState was called
setZip was called
address
0
readAddress was called
setEmail was called
setFirstName was called
setLastName was called
setNotes was called
setPhone was called
contact information
*/
