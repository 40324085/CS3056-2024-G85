package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Account;
import utils.TestUtils;

public class AccountTest {
	public static void main(String[] args) {
			testAccountConstructor();
			testAccountSetters();
			
			
		}
	
	
	public static void testAccountSetters() {
		//1 Setup
			String test_account_number="01";
			String test_new_account_number="02";
			String test_username_of_account_holder="MikeSmith@gmail.com";
			String test_new_username_of_account_holder="MikeSmith2@gmail.com";
			String test_account_type="Saving";
			String test_new_account_type="Standard";
			Date test_account_opening_date=null;
			Date test_new_account_opening_date=null;
			try {
				test_account_opening_date= new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				test_account_opening_date= new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2020");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Account AccountTest=new Account(test_account_number,test_username_of_account_holder,test_account_type,test_account_opening_date);
			//2 Exercise, run the object under test (Setters)
			AccountTest.setAccount_number(test_new_account_number);
			AccountTest.setUsername_of_account_holder(test_new_username_of_account_holder);
			AccountTest.setAccount_type(test_new_account_type);
			AccountTest.setAccount_opening_date(test_new_account_opening_date);
			
			//3 verify (Assert)
			//verify account number
			if(AccountTest.getAccount_number() == test_new_account_number) {
				System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestGetter-TC1 passed" + TestUtils.TEXT_COLOR_RESET);
				
			}
			else {
				System.out.println(TestUtils.TEXT_COLOR_RED + "TestGetter-TC1 failed; account number did not match" + TestUtils.TEXT_COLOR_RESET);
			}
			//verify username of account holder
			if(AccountTest.getUsername_of_account_holder() == test_new_username_of_account_holder) {
				System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestGetter-TC2 passed" + TestUtils.TEXT_COLOR_RESET);
				
			}
			else {
				System.out.println(TestUtils.TEXT_COLOR_RED + "TestGetter-TC2 failed; username of accoun holder did not match" + TestUtils.TEXT_COLOR_RESET);
			}
			//test account type
			if(AccountTest.getAccount_type() == test_new_account_type) {
				System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestGetter-TC3 passed" + TestUtils.TEXT_COLOR_RESET);
				
			}
			else {
				System.out.println(TestUtils.TEXT_COLOR_RED + "TestGetter-TC3 failed; account type did not match" + TestUtils.TEXT_COLOR_RESET);
			}
			//test account opening date
			if(AccountTest.getAccount_opening_date() == test_new_account_opening_date) {
				System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestGetter-TC4 passed" + TestUtils.TEXT_COLOR_RESET);
				
			}
			else {
				System.out.println(TestUtils.TEXT_COLOR_RED + "TestGetter-TC4 failed; account opening date did not match" + TestUtils.TEXT_COLOR_RESET);
			}
			
			
			//useing asserts.
			//assert 1==2;
			assert AccountTest.getAccount_number()==test_new_account_number;
			assert AccountTest.getUsername_of_account_holder()==test_new_username_of_account_holder;
			assert AccountTest.getAccount_type()==test_new_account_type;
			assert AccountTest.getAccount_opening_date()==test_new_account_opening_date;
			
			
			System.out.println("All Java assertions in the test suite passed (none failed)");
			
		}
	
	public static void testAccountConstructor() {
		//1-Setup
		String test_account_number="01";
		String test_username_of_account_holder="MikeSmith@gmail.com";
		String test_account_type="Saving";
		Date test_account_opening_date=null;
		try {
			test_account_opening_date= new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2 Exercise, run the object under test (constructor)
		Account AccountTest=new Account(test_account_number,test_username_of_account_holder,test_account_type,test_account_opening_date);
		//3 verify (Assert)
		//verify account number
		if(AccountTest.getAccount_number() == test_account_number) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC1 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC1 failed; account number did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		//verify username of account holder
		if(AccountTest.getUsername_of_account_holder() == test_username_of_account_holder) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC2 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC2 failed; username of accoun holder did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		//test account type
		if(AccountTest.getAccount_type() == test_account_type) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC3 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC3 failed; account type did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		//test account opening date
		if(AccountTest.getAccount_opening_date() == test_account_opening_date) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC4 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC4 failed; account opening date did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		
		
		//useing asserts.
		//assert 1==2;
		assert AccountTest.getAccount_number()==test_account_number;
		assert AccountTest.getUsername_of_account_holder()==test_username_of_account_holder;
		assert AccountTest.getAccount_type()==test_account_type;
		assert AccountTest.getAccount_opening_date()==test_account_opening_date;
		
		
		System.out.println("All Java assertions in the test suite passed (none failed)");
		
	}
}
