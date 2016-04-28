package com.epam.lab2.test_var20;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.epam.lab2.var20.Model;

public class ModelTest {
	
public static final double ACCURACY = 1e-10;
	
	Model model;
	
	@Before
	public void before() {
		model = new Model();
		model.setNumber(4627);
	}

	@Test
	public void testShiftNum() {
		assertEquals("shifted number", 7462, model.shiftNum(), ACCURACY);
	}

	@Test
	public void testFindLog() {
		assertEquals("natural logarithm", 8.44, model.findLog(), ACCURACY);
	}

}
