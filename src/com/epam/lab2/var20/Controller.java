package com.epam.lab2.var20;

import java.util.Scanner;

public class Controller {
	
	Model model;
	View view;
	
	/* Constructor with parameters */
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	//Work method
	public void processUser() {
		Scanner sc = new Scanner(System.in);
		
		view.printMessage(View.INPUT_INT_DATA);
		model.setNumber(inputFourDigitIntValueWithScanner(sc));
		
		view.printMessage(View.LOG_DATA + model.findLog());
		view.printMessage(View.SHIFT_DATA + model.shiftNum());
	}
	
	// The Utility methods
	
	/**
	 * Reads four digits positive integer value from input.
	 * 
	 * @param scanner Input scanner to read from.
	 * @return Four digits positive integer value from input.
	 */
    	public int inputFourDigitIntValueWithScanner(Scanner scanner) {
    		String str;
    	
        	while (true) {
	        	str = scanner.next();
	        	
	        	if (!checkNumber(str)) {
	        		view.printMessage(View.WRONG_INPUT_INT_DATA);
	        		view.printMessage(View.INPUT_INT_DATA);
	        	} else { //string has correct format
	        		break;
	        	}
	        }

        	return Integer.valueOf(str);
    	}
    
	/**
	* Checks if the given string contains 4 digit integer value.
	* 
	* @param string String to check.
	* @return Boolean.
	*/
	public boolean checkNumber(String string) {
		if (string.matches("[1-9][0-9]{3}")) { // "1023"
		    return true;
		} else {
		    return false;
		}
	}
}
