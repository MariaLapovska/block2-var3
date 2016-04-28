package com.epam.lab2.var20;

public class Model {
	
	private double precision;
	private int number;
	
	public Model() {
		this.precision = 1000.0;
	}
	
	/**
	 * Shifts 4 digit integer number on
	 * one position right in cycle.
	 * 
	 * @return Integer number, shifted one position right.
	 */
	public int shiftNum() {
		if ((number % 10) != 0) {
			return (number % 10) * 1000 + (int) (number / 10);
		} else if ((number % 1000) == 0) {
			return number / 1000;
		} else if ((number % 100) == 0) {
			return number / 100;
		} else { //(number % 10) == 0
			return number / 10;
		}
	}
	
	/**
	 * Finds the natural logarithm
	 * of the integer number with given precision.
	 * 
	 * @return Natural logarithm
	 * of the integer number with given precision.
	 */
	public double findLog() {
		return Math.round(Math.log(number) * (int) precision) / precision;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setPrecision(double precision) {
		this.precision = precision;
	}
}
