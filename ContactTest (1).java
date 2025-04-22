package test;

import cs320_mod3.Contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

// This references the SNHU video from the module resources (https://www.youtube.com/watch?v=KbXhK9HUng4) and the textbook.
class ContactTest {
	// Constructor test
	@Test
	void testContactSuccessfulConstructor() {
		Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
		
		assertTrue(newContact.getId().equals("1"));
		assertTrue(newContact.getFirstName().equals("Ginny"));
		assertTrue(newContact.getLastName().equals("Bouchard"));
		assertTrue(newContact.getPhoneNumber().equals("4402617654"));
		assertTrue(newContact.getAddress().equals("1223 Sassy St, New Belgium"));
	}
	
	// Setter tests
	// This successful setter test references SNHU Prof. Clinton Bush's video (https://www.youtube.com/watch?v=_OR2HqiVp5A&list=PL5Qak8r8wDYp3dD7x-wzjsAgSYbupkP7f&index=2).
	@Test
	void testContactSuccessfulSetters() {
		Contact newContact = new Contact("2", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
		
		newContact.setFirstName("Virginia");
		newContact.setLastName("Rupp");
		newContact.setPhoneNumber("1234567890");
		newContact.setAddress("1223 Sassier St");
		
		assertTrue(newContact.getFirstName().equals("Virginia"));
		assertTrue(newContact.getLastName().equals("Rupp"));
		assertTrue(newContact.getPhoneNumber().equals("1234567890"));
		assertTrue(newContact.getAddress().equals("1223 Sassier St"));
	}
	
	// Tests for failed setters (referenced from textbook CH3)
	@Test
	void testSetFirstNameInvalid() {
	    Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
	    assertThrows(IllegalArgumentException.class, () -> newContact.setFirstName("VeryVeryVeryLongName"));
	}
	
	@Test
	void testSetLastNameInvalid() {
	    Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
	    assertThrows(IllegalArgumentException.class, () -> newContact.setLastName("VeryVeryVeryLongName"));
	}
	
	@Test
	void testSetPhoneNumberInvalid() {
	    Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
	    assertThrows(IllegalArgumentException.class, () -> newContact.setPhoneNumber("1234"));
	}
	
	@Test
	void testSetAddressInvalid() {
	    Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
	    assertThrows(IllegalArgumentException.class, () -> newContact.setAddress("100001 Binary Way, Bytes Village, 10101"));
	}
	
	// Tests for ID
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
		});
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
		});
	}
	
	@Test
	void testContactIdMaxLength() {
		Contact newContact = new Contact("1234567891", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
		assertTrue(newContact.getId().equals("1234567891"));
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", null, "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
		});
	}
	
	// Tests for firstName
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Chrysanthemum", "Bouchard", "4402617654", "1223 Sassy St, New Belgiu");
		});
	}
	
	@Test
	void testContactFirstNameMaxLength() {
		Contact newContact = new Contact("1", "Genevieeve", "Bouchard", "4402617654", "1223 Sassy St, New Belgium");
		assertTrue(newContact.getFirstName().equals("Genevieeve"));
	}
	
	// Tests for lastName
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", null, "4402617654", "1223 Sassy St, New Belgium");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", "Bouchard-Rupp", "4402617654", "1223 Sassy St, New Belgium");
		});
	}
	
	@Test
	void testContactLastNameMaxLength() {
		Contact newContact = new Contact("1", "Ginny", "Bouchardde", "4402617654", "1223 Sassy St, New Belgium");
		assertTrue(newContact.getLastName().equals("Bouchardde"));
	}
	
	// Tests for phoneNumber
	@Test
	void testContactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", "Bouchard", null, "1223 Sassy St, New Belgium");
		});
	}
	
	@Test
	void testContactPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", "Bouchard", "440-261-7654", "1223 Sassy St, New Belgium");
		});
	}
	
	@Test
	void testContactPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", "Bouchard", "440261765", "1223 Sassy St, New Belgium");
		});
	}
	
	// Tests for address
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", "Bouchard", "4402617654", null);
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("12345678910", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO, 80808");
		});
	}
	
	@Test
	void testContactAddressMaxLength() {
		Contact newContact = new Contact("1", "Ginny", "Bouchard", "4402617654", "1223 Sassy St, New Belgium, CO");
		assertTrue(newContact.getAddress().equals("1223 Sassy St, New Belgium, CO"));
	}
}
