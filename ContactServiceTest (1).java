package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import cs320_mod3.Contact;
import cs320_mod3.ContactService;

//This references SNHU Prof. Matt Parker's video(https://www.youtube.com/watch?v=T8z1mCkPD1w&list=PLiBiZmk_cJpfTukygBzWsk1P5WhWV7aFZ&index=8) as well as the textbook.
class ContactServiceTest {
	private ContactService contactService;
	
	@BeforeEach
	void setUp() {
		contactService = new ContactService();
	}
	
	// Tests for addContact()
	@Test
	void testContactServiceAddContact() {
		Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		contactService.addContact(newContact);
		
		boolean contactAdded = false;
		for (Contact currentContact : contactService.getContacts()) {
			if (currentContact.getId().equals(newContact.getId())) {
				contactAdded = true;
			}
		}
		
		// Test is successful only if the new contact was found by ID in the list.
		assertTrue(contactAdded);
	}
	@Test
	void testContactServiceAddMultipleContacts() {
		Contact firstContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		contactService.addContact(firstContact);
		
		Contact secondContact = new Contact("2", "Snow", "Miser", "8889997777", "11 Chilly Dr, Greenland");
		contactService.addContact(secondContact);
		
		boolean firstContactAdded = false;
		boolean secondContactAdded = false;
		for (Contact currentContact : contactService.getContacts()) {
			if (currentContact.getId().equals(firstContact.getId())) {
				firstContactAdded = true;
			}
			if (currentContact.getId().equals(secondContact.getId())) {
				secondContactAdded = true;
			}
		}
		
		// Test is successful only if both of the new contacts were found by ID in the list.
		assertTrue(firstContactAdded);
		assertTrue(secondContactAdded);
	}
	
	@Test
	void testContactServiceDeleteContact() {
		Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		
		// Have to add the new contact before checking that it was deleted!
		contactService.addContact(newContact);
		contactService.deleteContact(newContact.getId());
		
		boolean contactDeleted = true;
		for (Contact currentContact : contactService.getContacts()) {
			if (currentContact.getId().equals(newContact.getId())) {
				contactDeleted = false;
				break;
			}
		}
		
		// Test is successful only if the new contact was NOT found by ID in the list.
		assertTrue(contactDeleted);
	}
	
	@Test
	void testContactServiceUpdateFirstName() {
		Contact newContact = new Contact("2", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		
		contactService.addContact(newContact);
		contactService.updateFirstName("2", "Virginia");
		
		assertTrue(newContact.getFirstName().equals("Virginia"));
	}
	
	@Test
	void testContactServiceUpdateLastName() {
		Contact newContact = new Contact("2", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		
		contactService.addContact(newContact);
		contactService.updateLastName("2", "Rupp");

		assertTrue(newContact.getLastName().equals("Rupp"));
	}
	
	@Test
	void testContactServiceUpdatePhoneNumber() {
		Contact newContact = new Contact("2", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		
		contactService.addContact(newContact);
		contactService.updatePhoneNumber("2", "1234567890");
		
		assertTrue(newContact.getPhoneNumber().equals("1234567890"));
	}
	
	@Test
	void testContactServiceUpdateAddress() {
		Contact newContact = new Contact("2", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		
		contactService.addContact(newContact);
		contactService.updateAddress("2", "1223 Sassier St");
		
		assertTrue(newContact.getAddress().equals("1223 Sassier St"));
	}
	
	

	
}
