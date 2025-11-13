package Exception;

import java.util.Scanner;
public class Users {
	public static void main(String[] args) throws InvalidCredentialsException {
	Credentials c1 = new Credentials("Divya","Divya");
	String username;
	String password;
	try {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the username");
	username=scan.next();
	System.out.println("Enter the password");
	password=scan.next();
	if(!username.equals(c1.getUsername())) {
		throw new InvalidCredentialsException("Invalid  user ");
	}
	else if(!password.equals(c1.getPassword())) {
		 String maskedMsg = password.replaceAll("\\p{L}", "*"); 
		    System.out.println("Invalid Password " + maskedMsg); 
		    throw new InvalidCredentialsException("Invalid  password ");
	}
	else {
		System.out.println("Successfully login");
	Payment.main(null);
	}}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
