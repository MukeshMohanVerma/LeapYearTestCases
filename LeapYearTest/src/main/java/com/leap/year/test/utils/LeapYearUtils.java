package com.leap.year.test.utils;

/**
 * 
 * Utility class which provide the methods to determine the given year is a leap year or not
 *
 */
public class LeapYearUtils {

	/**
	 * This method check that given year is divisible by 400 or not 
	 * 
	 * @param year
	 * @return true/false
	 */
	public static boolean isDivisibleBy400(final int year){
		
		return (year % 400 == 0);
	
	}
	
	/**
	 * This method check that given year is divisible by 100 but not by 400 
	 * 
	 * @param year
	 * @return true/false
	 */
	public static boolean isDivisibleBy100NotBy400(final int year){
		
		return (year % 100 == 0) == (year % 400 == 0);
	
	}
	
	/**
	 * This method check that given year is divisible by 4 but not by 100 
	 * 
	 * @param year
	 * @return true/false
	 */
	public static boolean isDivisibleBy4NotBy100(final int year){
		
		return (year % 4 == 0) != (year % 100 == 0);
	
	}
	
	/**
	 * This method check that given year is divisible by 4
	 * 
	 * @param year
	 * @return true/false
	 */
	public static boolean isDivisibleBy4(final int year){
		
		return (year % 4 == 0);
	
	}
	
	/**
	 * This method check that given year is greater than zero or not
	 * 
	 * @param year
	 * @return true/false
	 */
	public static boolean isGreaterThanZero(final int year) {
		
		return (year > 0);
	
	}
}
