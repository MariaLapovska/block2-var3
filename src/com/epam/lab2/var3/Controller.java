package com.epam.lab2.var3;

import java.util.Scanner;

public class Controller {
	
	Model model;
	View view;
	
	/**
	 * Constructor with parameters
	 * 
	 * @param model Model object
	 * @param view View object
	 */
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	//Work method
	public void processUser() {
		Scanner sc = new Scanner(System.in);
		
		view.printMessage(view.INPUT_INT_DATA);
		model.setNumber(inputTwoDigitIntValueWithScanner(sc));
		
		view.printMessage(view.ROOT_DATA + model.findRoot());
		view.printMessage(view.ROOT_INT_DATA + model.findRootNextInt());
		view.printMessage(view.SWAP_DATA + model.swapDigits());
	}
	
	// The Utility methods
	
	/**
	 * Reads two digits positive integer value from input.
	 * 
	 * @param scanner Input scanner to read from.
	 * @return Two digits positive integer value from input.
	 */
    public int inputTwoDigitIntValueWithScanner(Scanner scanner) {
    	String str;
    	
        while (true) {
        	str = scanner.next();
        	
        	if (!checkDigits(str) || !checkTwoDigits(str)) {
        		view.printMessage(view.WRONG_INPUT_INT_DATA);
        		view.printMessage(view.INPUT_INT_DATA);
        	} else { //string has correct format
        		break;
        	}
        }

        return Integer.valueOf(str);
    }
    
    /**
     * Checks if the given string has a correct format - 
     * has only 2 digits and doesn't start from 0.
     * 
     * @param string String to check.
     * @return
     * true if string has correct format, 
     * false otherwise.
     */
    public boolean checkTwoDigits(String string) {
    	if ((string.length() != 2) || string.charAt(0) == '0') {
	    		return false;
    	} else {
	    		return true;
    	}
    }
    
    /**
     * Checks if the given string contains only digits.
     * 
     * @param string String to check.
     * @return
     * true if string contains only digits, 
     * false otherwise.
     */
    public boolean checkDigits(String string) {
    	char[] charArr = string.toCharArray();
    	
    	for (char ch : charArr) {
    		if (!Character.isDigit(ch)) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
