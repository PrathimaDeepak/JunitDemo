package com.mockito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaxCalculatorTest {
	
	//TaxCalculator calculate = new TaxCalculator();
	TaxCalculator calculate;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is executed once before a test class is executed");
	}
	
	@Before
	public void setup() {
		calculate = new TaxCalculator();
	}
	
	@Test
	public void testForSalary70000() {
		//given
		TaxCalculator calculate = new TaxCalculator();
		Long expectedValue = 7000l;
		//when
		Long actualValue = calculate.calculateTax(70000);
		//then
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void testForSalary15000() {
		//given
		Long expectedValue = 1500l;
		//when
		Long actualValue = calculate.calculateTax(15000);
		//then
		assertEquals(expectedValue,actualValue);
	}

	@Test
	public void testForSalary25000() {
		
		assertEquals((long) 2500,calculate.calculateTax(25000));
		
	}
	
	@Test
	public void testForTwoScenarios() {
		assertEquals((long) 300,calculate.calculateTax(3000));
		assertEquals((long) 500,calculate.calculateTax(5000));
	}
	
	@Test
	public void testAssertFalseExample() {
		
		assertFalse(calculate.calculateTax(20000) == 200);
	
	}
	
	@Test
	public void testAssertTrueExample() {
		
		assertTrue(calculate.calculateTax(5000) == 500);
	
	}
	
	@After
	public void destroyObjects() {
		calculate = null;
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This is executed once after a test class is executed");
	}

}
