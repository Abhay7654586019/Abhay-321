package javatest;
import java.util.regex.*;
import java.util.*;

public class Emailvalidation {
		public static boolean isValid(String email)
		{
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		if (email == null)
		return false;
		return pattern.matcher(email).matches();
		}
		
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your email: ");
	        String email = sc.nextLine();
	        try {
	        	if(!isValid(email))
	        		throw new InvalidEmailException("Email is not valid");
	        	System.out.println("Email is valid");
	        }catch(InvalidEmailException e) {
	        	System.out.println(e.getMessage());
	        }

		
		
	}

}
