package com.revature.users;

import java.util.Scanner;

public class UserLogIn {
	//Establish method to call UserLogin() to identify if it is a Login or SignUp
	public void UserPrompt() {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Welcome to East Coast Bank\n\n Please select one of the following options:")
			System.out.println("[1] Create a new account");
			System.out.println("[2] Log in to an existing account");

	 int user = sc.nextInt(); // Read user inputs
	 boolean validated;
	switch(user) {
	
	case 1:
		
		System.out.println("Please create your profile.");
		SignUpForm userValues = new SignUpForm();
		
		
		System.out.println("Enter [1] For Single account");
		//System.out.println("Enter [2] For Joint account");
		String accountType = sc.nextLine();
		userValues.setAccountType(accountType);
		
		System.out.println("Enter name (First/Last) for Primary Account Holder:");
		String fullName = sc.next();
		userValues.setFullName(fullName);
		
		System.out.println("Enter Primary Account Holder's city and state: ");
		String address = sc.next();
		userValues.setAddress(address);
		
		System.out.println("Enter phone number for Primary Account Holder: (xxx-xxx-xxxx");
		String phoneNumber = sc.next();
		userValues.setPhoneNumber(phoneNumber);
		
		System.out.println("Create a user name for Primary Account Holder: ");
		String userName = sc.next();
		userValues.setUserName(userName);
		// check to make sure username doesn't already exist
		//if statement to check against username ArrayList
		
		System.out.println("Create a password for Primary Account Holder: ");
		String password = sc.next();
		userValues.setPassword(password);
		
		//System.out.println(userValues.getAccountType()+" "+userValues.getFullName()+" "+userValues.getAddress()
		//+" "+userValues.getPhoneNumber());
		System.out.println(userValues);
		
		//add account info to ArrayList
		
		//System.out.println("Thank you for applying wait for bank approval");
		//System.out.println("Enter 1) To go to the main menu");
		//int op = sc.nextInt(); // Read user inputs
		//while(op)
	break;
	
	case 2:
		System.out.println("Welcome back existing user");
		System.out.println("Enter you username");
		userName = sc.next();
		System.out.println("Enter you password");
		password = sc.next();
		//Validate username and password exists and is correct
		//Write code for wrong inputs (exception?)
		//create variable called validated == true
		//userValues.setFullName(fullName);
		
		//if ((userValues.userName == userName ) && (userValues.password == password )) {
		//	System.out.println("You are LOGGED IN");
		//}else {
		//	System.out.println("Credentials not valid");
		//}
	break;
	
	case 3:
		System.out.println("Have a good day!!");
	break;
		}
	}
}

/*
 * Scanner inputs for Joint Accounts
 * 
 * System.out.println("Enter [2] For Joint account"); String accountType2 =
 * sc.nextLine(); userValues.setAccountType(accountType);
 * 
 * System.out.println("Enter name (First/Last) for Secondary Account Holder:");
 * String fullName2 = sc.next(); userValues.setFullName(fullName);
 * 
 * System.out.println("Enter Secondary Account Holder's city and state: ");
 * String address2 = sc.next(); userValues.setAddress(address);
 * 
 * System.out.
 * println("Enter phone number for Secondary Account Holder: (xxx-xxx-xxxx");
 * String phoneNumber2 = sc.next(); userValues.setPhoneNumber(phoneNumber);
 * 
 * System.out.println("Create a user name for Secondary Account Holder: ");
 * String userName = sc.next(); userValues.setUserName(userName); // check to
 * make sure username doesn't already exist //if statement to check against
 * username ArrayList
 * 
 * System.out.println("Create a password for Secondary Account Holder: ");
 * String password = sc.next(); userValues.setPassword(password);
 * 
 * //System.out.println(userValues.getAccountType()+" "+userValues.getFullName()
 * +" "+userValues.getAddress() //+" "+userValues.getPhoneNumber());
 * System.out.println(userValues);
 * 
 * //add account info to ArrayList
 */
