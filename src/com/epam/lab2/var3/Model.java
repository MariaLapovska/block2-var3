package com.epam.lab2.var3;

public class Model {
	private double precision;
	private int number;
	
	public Model() {
		this.precision = 1000.0;
	}
	
	/**
	 * Finds root of the integer number 
	 * rounded with given precision.
	 * 
	 * @return Root of the integer number 
	 * rounded with given precision.
	 */
	public double findRoot() {
		return Math.round(Math.sqrt((double) number) * (int) precision) 
				/ precision;
	}
	
	/**
	 * Finds the closest integer to the
	 * root of the integer number.
	 * 
	 * @return Closest integer to the
	 * root of the integer number.
	 */
	public int findRootNextInt() {
		return (int) Math.round(findRoot());
	}
	
	/**
	 * Swaps digits of the integer number.
	 * If number ends on zero, casts zero:
	 * 10 becomes 1, 20 - 2, etc.
	 * 
	 * @return Integer number with swapped digits.
	 */
	public int swapDigits() {
		if ((number % 10) == 0) { // if number ends on 0
			return number / 10;
		} else { //(number % 10) != 0
			StringBuilder sb = new StringBuilder();
			return Integer.valueOf(sb.append(number).reverse().toString());
		}
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setPrecision(double precision) {
		this.precision = precision;
	}
}
