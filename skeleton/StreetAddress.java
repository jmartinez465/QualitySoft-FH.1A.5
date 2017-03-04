
/**
 * Skeleton for Class StreetAddres.
 * Each object of this class 
 * stores a contact address
 * 
 * @version Draft-1 Mar 2 2017
 * @author Quang Phan
 */
public class StreetAddress {
//data member:
	private String house;
	private String city;
	private String state;
	private String zip;
	private String country;
		
//--------------------------
// Public Instance Methods
//--------------------------
	/**														
	 * sets the value for house to "newHouse"
	 */
	public void setHouse(String newHouse) {	
		System.out.println("setHouse was called");
	}
	
	/**
	 * sets the value for city to "newCity"
	 */
	public void setCity(String newCity) {
		System.out.println("setCity was called");
	}
	
	/**
	 * sets the value for state to "newState"
	 */
	public void setState(String newState) {
		System.out.println("setState was called");
	}
	
	/**
	 * sets the value for zip to "newZip"
	 */
	public void setZip(String newZip) {
		System.out.println("setZip was called");
	}
	
	/**
	 * sets the value for country to "newCountry
	 */
	public void setCountry(String newCountry) {
		System.out.println("setCountry was called");
	}
	
	/**
	 * returns a String containing all the address info.
	 */
	public String getAddress() {							
		return "address";
	}
}
