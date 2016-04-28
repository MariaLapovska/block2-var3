package com.epam.lab2.test_var3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import com.epam.lab2.var3.Model;

public class ModelTest {
	
	public static final double ACCURACY = 1e-10;
	
	Model model;
	
	@Before
	public void before() {
		model = new Model();
		model.setNumber(64);
	}
	
	@Test
	public void testFindRoot() {
		assertEquals("square root", 8.0, model.findRoot(), ACCURACY);
	}

	@Test
	public void testFindRootNextInt() {
		assertEquals("integer, close to square root", 
				     8, model.findRootNextInt());
	}

	@Test
	public void testSwapDigits() {
		assertEquals("", 46, model.swapDigits());
	}
}
