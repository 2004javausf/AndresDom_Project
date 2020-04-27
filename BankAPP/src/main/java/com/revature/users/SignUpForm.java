package com.revature.users;

import java.util.Scanner;

public class SignUpForm {
	
	

	private String accountType;
	private String fullName;
	private String address;
	private String phoneNumber;
	private String userName;
	private String password;
	
	Scanner sc= new Scanner(System.in);

	public void Form(String accountType, String fullName, String address, String phoneNumber, String userName, String password) {
		
		this.accountType = accountType;
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
		

	}
	


	public String getAccountType() { 
		 
		return accountType;
	}

	public void setAccountType(String accountType) {
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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "SignUpForm [Account Type=" + accountType + ", Full Name=" + fullName + ", Address=" + address
				+ ", Phone Number=" + phoneNumber + ", User Name=" + userName + ", Password=" + password + "]";
	}
	

	

}
