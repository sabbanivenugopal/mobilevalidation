package mobilevalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Validation {
	
	public static void main(String[] args) {
	//	boolean validPan = isValidPan("QUE31234H");
	//	System.out.println(validPan);
		
	}
	public boolean isValidMobile(String mobile) {
		Pattern p =Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(mobile);
		return m.matches();
		
	}
	
	public static boolean isValidPan(String pan) {
		Pattern p =Pattern.compile("[A-Z]{4}[0-9]{4}[A-Z]{1}");
		Matcher m = p.matcher(pan);
		return m.matches();
		
	}

}
