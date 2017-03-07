/**
 * Skeleton for main
 * tests Class Person, StreetAddress and ContactList
 * 
 * @version Draft-1 Mar 2 2017
 * @author Quang Phan
 */
public class TestProgram {
	public static void main(String[] args) {
		ContactList list = new ContactList(5);
		list.open();
		list.add();
		list.printList();
		list.search("");
		list.exit();
		
		Person contact = new Person();
		contact.setAddress();
		contact.setEmail("");
		contact.setFirstName("");
		contact.setLastName("");
		contact.setNotes("");
		contact.setPhone("");
		System.out.println(contact.getContact());
		
		StreetAddress address = new StreetAddress();
		address.setCity("");
		address.setCountry("");
		address.setHouse("");
		address.setState("");
		address.setZip("");
		System.out.println(address.getAddress());
		
	}
	
}

/*RUN
start was called
add was called
printList was called
search was called
quit was called
setAddress was called
setEmail was called
setFirstName was called
setLastName was called
setNotes was called
setPhone was called
contact information
setCity was called
setCountry was called
setHouse was called
setState was called
setZip was called
address
*/
