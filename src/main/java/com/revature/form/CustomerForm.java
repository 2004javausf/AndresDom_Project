package com.revature.form;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.beans.Customer;

public class CustomerForm {
	
	//Establish method to call UserLogin() to identify if it is a Login or SignUp
		
		/*
		 * private String customerName; private String phoneNumber; private String
		 * userName; private String password; private String accountType; private String
		 * accStatus;
		 */
		
		public static void UserPrompt() {
			ArrayList<Customer> signUpForm = new ArrayList<Customer>();
			Customer userValues = new Customer();
			Scanner sc = new Scanner(System.in);
			
			//int accountNumber=0;
			
			
			System.out.println("Please create your profile.");
			System.out.println("Account type 1)For Single account");
			System.out.println("Account type 2)For Joint account");
			String accountType = sc.next();
			userValues.setAccountType(accountType);
			if(accountType=="1") {
				System.out.println("You need to complete one form");
			}else if(accountType=="1") {
				System.out.println("You need to complete two forms");
			}
			
			///loop to validate the number of forms
			//while(accountType == "1"); {
			System.out.println("Insert Full Name: ");
			String customerName = sc.next();
			userValues.setCustomerName(customerName);
			
			System.out.println("Insert address: ");
			String address = sc.next();
			userValues.setAddress(address);
			
			System.out.println("Insert phone number: ");
			String phoneNumber = sc.next();
			userValues.setPhoneNumber(phoneNumber);
			
			System.out.println("Insert user name: ");
			String userName = sc.next();
			userValues.setUserName(userName);
			
			System.out.println("Insert password: ");
			String password = sc.next();
			userValues.setPassword(password);
			
			
			//add account info to ArrayList
			signUpForm.add(userValues);//we added the java bean to an ArrayList
			for (int i = 0; i < signUpForm.size(); i++)  {
	            System.out.print(signUpForm.get(i) + " ");         
			//}
			
			}
	
		
		}
	
}
