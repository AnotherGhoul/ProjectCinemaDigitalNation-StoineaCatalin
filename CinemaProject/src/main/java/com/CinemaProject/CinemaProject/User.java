package com.CinemaProject.CinemaProject;

public class User {
	private String firstName,lastName;
	private String accountId;
	private String phoneNumber;
	
	public User() {}

	public User(String firstName, String lastName, String accountId, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountId = accountId;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		String s ="User [firstName=" + firstName + ", lastName=" + lastName + ", accountId=" + accountId + ", phoneNumber="
				+ phoneNumber + "]";
		return s;
	}
	
	
	
}
 