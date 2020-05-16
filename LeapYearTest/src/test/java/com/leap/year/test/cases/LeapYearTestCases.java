package com.leap.year.test.cases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.leap.year.test.utils.LeapYearUtils;

/**
 * 
 * Unit test cases to determine given year is a leap year or not.
 *
 */
public class LeapYearTestCases {

	/**
	 * Test case 1 to test the given year is a leap year if divisible by 400.
	 */
	@Test
	public void divideBy400Test() {
		String message = "Leap year must be divide by 400";
		boolean status = LeapYearUtils.isDivisibleBy400(2000);
		assertEquals(message,  true, status);
	}

	/**
	 * Test case 2 to test the given year is not a leap year if not divisible by 100 and 400.
	 */
	@Test
	public void divideBy100NotBy400Test() {
		String message = "Leap year must be divide by 100 and 400";
		boolean status = LeapYearUtils.isDivisibleBy100NotBy400(2000);
		assertEquals(message,  true, status);
	}
	
	/**
	 * Test case 3 to test the given year is a leap year if divisible by 4 and not by 100.
	 */
	@Test
	public void divideBy4NotBy100Test() {
		String message = "Leap year must be divide by 4 and not divide by 100";
		boolean status = LeapYearUtils.isDivisibleBy4NotBy100(2016);
		assertEquals(message,  true, status);
	}
	
	/**
	 * Test case 4 to test the given year is a leap year if divisible by 4.
	 */
	@Test
	public void divideBy4Test() {
		String message = "Leap year must be divide by 4";
		boolean status = LeapYearUtils.isDivisibleBy4(2016);
		assertEquals(message,  true, status);
	}
	
	/**
	 * Test case 5 to check given year is greater than zero or not .
	 */
	@Test
	public void yearGreaterThanZeroTest() {
		String message = "Year must be greater than zero";
		boolean status = LeapYearUtils.isGreaterThanZero(4);
		assertEquals(message,  true, status);
	}
	
}
