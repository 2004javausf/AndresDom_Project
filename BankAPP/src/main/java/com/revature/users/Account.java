package com.revature.users;

public class Account {
	
	private String AccNum;
	private  double initialBalance;
	private double endBalance;
	private String accType;
	
	public Account(String AccNum, double intialBalance, double endBalance, String accType) { 
		
	
	
	public String getAccNum() {
		return AccNum;
	}
	public void setAccNum(String accNum) {
		AccNum = accNum;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public double getEndBalance() {
		return endBalance;
	}
	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	@Override
	public String toString() {
		return "Account [AccNum=" + AccNum + ", initialBalance=" + initialBalance + ", endBalance=" + endBalance
				+ ", accType=" + accType + "]";
	}
	
	
	
}
