package com.revature.users;

public class Employee {
	private String empName;
	private String empID;
	private String userName;
	private String password;
	private String accountType;
	
	
	public void empProfile(String empName, String empID, String userName, 
			String password, String accountType) {
		this.empName=empName;
		this.empID=empID;
		this.userName=userName;
		this.password=password;
		this.accountType=accountType;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpID() {
		return empID;
	}


	public void setEmpID(String empID) {
		this.empID = empID;
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


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", userName=" + userName + ", password=" + password
				+ ", accountType=" + accountType + "]";
	}
}
