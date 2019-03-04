package com.learn.junit5.facade;

public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private boolean isMarried;

	public Person(String firstName, String lastName, String phoneNumber, boolean isMarried) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.isMarried = isMarried;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public boolean hasError() {
		throw new SomeException();
	}

}
