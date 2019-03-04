package com.learn.junit5;

import com.learn.junit5.facade.Person;
import com.learn.junit5.facade.SomeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionsTests {
	Person person;
	@BeforeEach
	public void setup() {
		person = new Person("", "", "", false);
	}


	@Test
	public void test() {
		Assertions.assertThrows(SomeException.class, () -> person.hasError());
	}
}
