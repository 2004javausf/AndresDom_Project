package com.revature.form;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.menu.EmployeeMenu;

public class CustomerForm {
	
	//Establish method to call UserLogin() to identify if it is a Login or SignUp
		
		/*
		 * private String customerName; private String phoneNumber; private String
		 * userName; private String password; private String accountType; private String
		 * accStatus;
		 */
		
		@SuppressWarnings("resource")
		public static void UserPrompt() {
			ArrayList<Customer> signUpForm = new ArrayList<Customer>();
			Customer userValues = new Customer();
			Scanner scan = new Scanner(System.in);
			
			//int accountNumber=0;
			
			
			System.out.println("Please create your profile.");
			System.out.println("Account type 1)For Single account");
			System.out.println("Account type 2)For Joint account");
			System.out.println("3)To go back to the previous menu");
			String accountType = scan.nextLine();
			//userValues.setAccountType(accountType);
			
			switch(accountType) {
			case "1":
				System.out.println("You need to complete one form");
				///loop to validate the number of forms
				//while(accountType == "1"); {
				System.out.println("Insert Full Name: ");
				String customerName = scan.next();
				userValues.setCustomerName(customerName);
				
				System.out.println("Insert address: ");
				String address = scan.next();
				userValues.setAddress(address);
				
				System.out.println("Insert phone number: ");
				String phoneNumber = scan.next();
				userValues.setPhoneNumber(phoneNumber);
				
				System.out.println("Insert user name: ");
				String userName = scan.next();
				userValues.setUserName(userName);
				
				System.out.println("Insert password: ");
				String password = scan.next();
				userValues.setPassword(password);
				
				
				//add account info to ArrayList
				signUpForm.add(userValues);//we added the java bean to an ArrayList
			
				for (int i = 0; i < signUpForm.size(); i++)  {
		            System.out.print(signUpForm.get(i) + " ");         
				}
		            
		           // System.out.println("=================================================");
					//System.out.println("Thank you, Wait for your account to be approved.");
					//System.out.println("=================================================");
				
			
			break;
			
				
				
				
			case "2": 
				System.out.println("Sorry we are in maintainance");
			break;
			case "3": 
				EmployeeMenu.employeeMenu();
			break;
			}
			
			//creating folder to store arraList information
			
			FileWriter writer = null;
			try {
				writer = new FileWriter("output.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			for(Customer str: signUpForm) {
			  try {
				writer.write(str + System.lineSeparator());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
}
