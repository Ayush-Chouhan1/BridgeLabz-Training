package com.interfaces.staticmethodsinterfaces.passwordstrength;

public class Password implements SecurityUtils{
	
	public static void main(String[] args) {
		 String password = "Ayush@123";

	        if (SecurityUtils.isValidPassword(password)) {
	            System.out.println("Password is strong");
	        } else {
	            System.out.println("Password is weak");
	        }
	}

}
