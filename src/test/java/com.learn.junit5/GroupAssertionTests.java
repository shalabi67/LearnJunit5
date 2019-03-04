package com.learn.junit5;

import com.learn.junit5.facade.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupAssertionTests {
	private Person shalabi = new Person("Mohammad", "Shalabi", "1234", true);
	@Test
	void testGroupAssertion() {
		Assertions.assertAll("Validate Person",
				()->Assertions.assertEquals(shalabi.getFirstName(), "Mohammad", "Validate first name"),
				()->Assertions.assertEquals(shalabi.getLastName(), "Shalabi", "validate last name"),
				()->Assertions.assertEquals(shalabi.getPhoneNumber(), "1234", "validate phone number"),
				()->Assertions.assertTrue(shalabi.isMarried(), "validate is married")
		);
	}

}
