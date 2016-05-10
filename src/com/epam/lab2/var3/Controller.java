package com.epam.lab2.var3;

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
		model.setNumber(inputTwoDigitIntValueWithScanner(sc));
		
		view.printMessage(View.ROOT_DATA + model.findRoot());
		view.printMessage(View.ROOT_INT_DATA + model.findRootNextInt());
		view.printMessage(View.SWAP_DATA + model.swapDigits());
	}
	
	// The Utility methods
	
	/**
	 * Reads two digits positive integer value from input.
	 * 
	 * @param scanner Input scanner to read from.
	 * @return Two digits positive integer value from input.
	 */
	private int inputTwoDigitIntValueWithScanner(Scanner scanner) {
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
	* Checks if the given string contains 2 digit integer value.
	* 
	* @param string String to check.
	* @return boolean.
	*/
	private boolean checkNumber(String string) {
		if (string.matches("[1-9][0-9]")) { // "65"
		    return true;
		} else {
		    return false;
		}
	}
}
