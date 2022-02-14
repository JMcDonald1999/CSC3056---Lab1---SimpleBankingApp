package tests;

import java.util.Date;

import model.User;
import model.Account;
import model.Transaction;

public class UserTests {

	public static void main(String[] args) {
		//Manual Testing
//		User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
//		Account testAccount = new Account("12345678", "mike", "Checking", new Date());
//		Transaction testTransaction = new Transaction("12345678", 32.50, new Date());
//		System.out.println(testUser);
//		System.out.println(testAccount);
//		System.out.println(testTransaction);
		
		//Automated Testing
		String testUsername = "mike";
		String testPassword = "my_passwd";
		String testFirstName = "Mike";
		String testLastName = "Smith";
		String testMobileNumber = "07771234567";
		
		User testUser = new User(testUsername, testPassword, testFirstName, testLastName, testMobileNumber);
		
		Boolean passed = true;	
		if (!testUsername.equals(testUser.getUsername())) {
			System.out.println("TC1 Failed: username did not match");
			passed = false;
		}
		if (!testPassword.equals(testUser.getPassword())) {
			System.out.println("TC2 Failed: password did not match");
			passed = false;
		}
		if (!testFirstName.equals(testUser.getFirstName())) {
			System.out.println("TC3 Failed: first Name did not match");
			passed = false;
		}
		if (!testLastName.equals(testUser.getLastName())) {
			System.out.println("TC4 Failed: last name did not match");
			passed = false;
		}
		if (!testMobileNumber.equals(testUser.getMobileNumber())) {
			System.out.println("TC5 Failed: mobile number did not match");
			passed = false;
		}
		
		if (passed) {
			System.out.println("All TC's passed.");
		}
		
		//Using asserts
		assert testUsername == testUser.getUsername();
		assert testPassword == testUser.getPassword();
		assert testFirstName == testUser.getFirstName();
		assert testLastName == testUser.getLastName();
		assert testMobileNumber == testUser.getMobileNumber();
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
	}

}
