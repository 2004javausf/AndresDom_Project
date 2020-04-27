package com.revature.users;

import java.util.Scanner;

public class UserLogIn {
	//Establish method to call UserLogin() to identify if it is a Login or SignUp
	public void UserPrompt() {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Welcome to East Coast Bank\n\n Please select one of the following options:\n\n "
			+ "Enter 1) for a new account or Enter 2) to login to an existing account 3) To Finish");

	 int user = sc.nextInt(); // Read user inputs
	 boolean validated;
	switch(user) {
	
	case 1:
		
		System.out.println("Please create your profile.");
		SignUpForm userValues = new SignUpForm();
		
		
		System.out.println("Account type 1)For Single account");
		//System.out.println("Account type 2)For Joint account");
		String accountType = sc.nextLine();
		userValues.setAccountType(accountType);
		
		System.out.println("Insert Full Name: ");
		String fullName = sc.next();
		userValues.setFullName(fullName);
		
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
		System.out.println("You choose to Log In");
		System.out.println("enter you user name");
		userName = sc.next();
		System.out.println("enter you password");
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
