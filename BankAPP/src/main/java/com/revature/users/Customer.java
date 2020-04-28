package com.revature.users;

public class Customer {

	
	private String customerName;
	private String mailingAddress;
	private String phoneNumber;
	private String userName;
	private String password;
	private String accountType;
	private String accStatus;
	
	public void profileInfo(String customerName, String mailingAddress, String phoneNumber, String userName, 
			String password, String accountType, String accStatus) {
		this.customerName=customerName;
		this.mailingAddress=mailingAddress;
		this.phoneNumber=phoneNumber;
		this.userName=userName;
		this.password=password;
		this.accountType=accountType;
		this.accStatus=accStatus;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
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

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", mailingAddress=" + mailingAddress + ", phoneNumber="
				+ phoneNumber + ", userName=" + userName + ", password=" + password + ", accountType=" + accountType
				+ ", accStatus=" + accStatus + "]";
	}

	
	}
	
	
