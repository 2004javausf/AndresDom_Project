package com.revature.users;

import java.util.Scanner;

public class UserLogIn {
	//Establish method to call UserLogin() to identify if it is a Login or SignUp
	public void UserPrompt() {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Welcome to East Coast Bank\n\n Please select one of the following options:\n\n "
			+ "Enter 1) for a new account or Enter 2) to login to an existing account");

	 String user = sc.nextLine(); // Read user inputs
	switch(user) {
	
	case "1":
		System.out.println("Please create your profile.");
		SignUpForm userValues =new SignUpForm();
		userValues.Form(1, "Andres", "Miami");
	break;
	case "2":
		System.out.println("You choose to Log In");
	break;
	}
	
	}

}
