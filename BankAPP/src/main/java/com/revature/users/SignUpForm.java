package com.revature.users;

import java.util.Scanner;

public class SignUpForm {
	
	

	private int accountType;
	private String fullName;
	private String address;

	public void Form(int accountType, String fullName, String address) {
		
		this.accountType = accountType;
		this.fullName = fullName;
		this.address = address;
		
	
	}

	

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "SignUpForm [accountType=" + accountType + ", fullName=" + fullName + ", address=" + address + "]";
	}

	

}
