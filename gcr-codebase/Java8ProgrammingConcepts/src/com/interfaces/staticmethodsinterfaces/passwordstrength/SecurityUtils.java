package com.interfaces.staticmethodsinterfaces.passwordstrength;

public interface SecurityUtils {

	  static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

	    public static boolean isValidPassword(String password) {
	        return password.matches(PASSWORD_REGEX);
	    }
	}

