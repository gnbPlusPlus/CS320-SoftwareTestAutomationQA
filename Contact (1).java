package cs320_mod3;

public class Contact {
	// Required attributes from the assignment guidelines
	private final String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address; 
	
	// Constructor with conditional checks modeled by SNHU video (https://www.youtube.com/watch?v=KbXhK9HUng4)
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// Modeled in the above referenced SNHU video
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	// Getters and setters for accessing or altering private attributes safely
	public String getId() {
		return id;
	}  // Id has no setter because it is unable to be updated per assignment guidelines.
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.address = address;
	}
}
