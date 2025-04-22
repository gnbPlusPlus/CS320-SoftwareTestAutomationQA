package cs320_mod3;

import cs320_mod3.Contact;
import java.util.ArrayList;

// This references SNHU Prof. Matt Parker's video(https://www.youtube.com/watch?v=T8z1mCkPD1w&list=PLiBiZmk_cJpfTukygBzWsk1P5WhWV7aFZ&index=8) somewhat.
public class ContactService {
	private ArrayList<Contact> contacts;
	
	// Constructor
	public ContactService() {
		this.contacts = new ArrayList<>();
	}
	
	// Getter
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	// Add a new contact via Contact.java's constructor method
	public void addContact(Contact newContact) {
		// Check whether new contact has a unique ID before adding
		boolean contactExists = false;
		for (Contact currentContact : contacts) {
			if (currentContact.getId().equals(newContact.getId())) {
				contactExists = true;
				throw new IllegalArgumentException("Contact with that ID already exists");
			}
		}
		
		// Add only if duplicate ID not present
		if (!contactExists) {
			contacts.add(newContact);
		}
	}
	
	// Delete a contact by searching for its unique ID in contacts ArrayList
	public void deleteContact(String id) {
		for (Contact currentContact : contacts) {
			if (currentContact.getId().equals(id)) {
				contacts.remove(currentContact);
				break;  // This fixes a looping error I was running into.
			}
		}
	}
	
	// Update a contact's first name by searching for its unique ID
	public void updateFirstName(String id, String firstName) {
		for (Contact currentContact : contacts) {
			if (currentContact.getId().equals(id)) {
				currentContact.setFirstName(firstName);
			}
		}
	}
	
	// Update a contact's last name by searching for its unique ID
	public void updateLastName(String id, String lastName) {
		for (Contact currentContact : contacts) {
			if (currentContact.getId().equals(id)) {
				currentContact.setLastName(lastName);
			}
		}
	}
	
	// Update a contact's phone number by searching for its unique ID
	public void updatePhoneNumber(String id, String phoneNumber) {
		for (Contact currentContact : contacts) {
			if (currentContact.getId().equals(id)) {
				currentContact.setPhoneNumber(phoneNumber);
			}
		}
	}
	
	// Update a contact's address by searching for its unique ID
	public void updateAddress(String id, String address) {
		for (Contact currentContact : contacts) {
			if (currentContact.getId().equals(id)) {
				currentContact.setAddress(address);
			}
		}
	}

}
