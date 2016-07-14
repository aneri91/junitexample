package com.ispl.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstJUnitTest {

	public int addition(int x, int y) {
		return x + y;
	}

	@Test
	public void testingCrunchifyAddition() {
		assertEquals("Here is test for Addition Result: ", 300, addition(27, 3));
	}

	public String helloWorld() {
		String helloWorld = "Hello +" + " World";
		return helloWorld;
	}

	@Test
	public void testingHelloWorld() {
		assertEquals("Here is test for Hello World String: ", "Hello -- World", helloWorld());
	}
}
