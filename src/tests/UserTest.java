package tests;

import model.User;
import utils.TestUtils;
public class UserTest {
	public static void main(String[] args) {
		
		testUserConstructor();
		/*Old non automated test. Not required anymore.
		 * User testUser=new User("mike","my_passwd","Mike","Smith","07771234567");
		 * System.out.println(testUser);
		 */
		
		
	}
	
	public static void testUserConstructor() {
		//1-Setup
		String test_username="mike";
		String test_password="my_passwd";
		String test_first_name="Mike";
		String test_last_name="Smith";
		String test_mobile_number="07771234567";
		
		//2 Exercise, run the object under test (constructor)
		User testUser= new User(test_username,test_password,test_first_name,test_last_name,test_mobile_number);
		System.out.println("Hello World");
		//3 verify (Assert)
		//verify username
		if(testUser.getUsername() == test_username) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC1 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC1 failed; username did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		//verify password
		if(testUser.getPassword() == test_password) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC2 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC2 failed; password did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		//verify firstname
		if(testUser.getFirst_name() == test_first_name) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC3 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC3 failed; first name did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		//verify lastname
		if(testUser.getLast_name() == test_last_name) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC4 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC4 failed; last name did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		//verify mobile number
		if(testUser.getMobile_number() == test_mobile_number) {
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TestConstructor-TC4 passed" + TestUtils.TEXT_COLOR_RESET);
			
		}
		else {
			System.out.println(TestUtils.TEXT_COLOR_RED + "TestConstructor-TC4 failed; last name did not match" + TestUtils.TEXT_COLOR_RESET);
		}
		
		
		//useing asserts.
		//assert 1==2;
		assert testUser.getUsername()==test_username;
		assert testUser.getPassword()==test_password;
		assert testUser.getFirst_name()==test_first_name;
		assert testUser.getLast_name()==test_last_name;
		assert testUser.getMobile_number()==test_mobile_number;
		
		
	}
}
