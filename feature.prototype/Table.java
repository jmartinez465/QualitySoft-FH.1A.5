/**
 * Each object of this class contains 1 contact
 * information and the methods needed to print those
 * information into a table
 * @author zelda
 *
 */
public class Table {
	private Person current;
	final int LAST_NAME_FIELD = 10,
			  FIRST_NAME_FIELD = 10,
	  		  ADDRESS_FIELD = 10,
			  EMAIL_FIELD = 20,
			  PHONE_FIELD = 12,
			  NOTES_FIELD = 30;
	
	private String[] lastName;
	private String[] firstName;
	private String[] address;
	private String[] email;
	private String[] phone;
	private String[] notes;
	
	public Table(Person contact) {
		current = contact;
		lastName = stringToArray(current.lastName, LAST_NAME_FIELD);
		firstName = stringToArray(current.firstName, FIRST_NAME_FIELD);
		address = stringToArray(current.address.toString(), ADDRESS_FIELD);
		email = stringToArray(current.emailAddress, EMAIL_FIELD);
		phone = stringToArray(current.phoneNumber, PHONE_FIELD);
		notes = stringToArray(current.notes, NOTES_FIELD);
	}
	
	public String[] stringToArray(String info, int field) {
		int numberOfLines;
		int finalCharacters;
		numberOfLines = (int)Math.ceil( (double)info.length() / field );
		finalCharacters = info.length() % field;
		
		String[] array = new String[numberOfLines];
		
		for (int index = 0; index < numberOfLines; index++) {
			if (index == (numberOfLines - 1) && finalCharacters != 0) {
				array[index] = info.substring(index*field, info.length());
			} else {
				array[index] = info.substring(index*field, (index+1)*field);
			}
			}
			
		return array;
		
	}
	
	public void printEach(String[] arrayToPrint) {	
		for (int index = 0; index < arrayToPrint.length; index++) {
			System.out.println(arrayToPrint[index]);
		}
		
	}
	
	public void printAll() {
		printEach(lastName);
		printEach(firstName);
		printEach(address);
		printEach(email);
		printEach(phone);
		printEach(notes);
	}

}
