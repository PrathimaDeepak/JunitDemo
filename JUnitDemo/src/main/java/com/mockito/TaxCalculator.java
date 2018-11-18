package com.mockito;

public class TaxCalculator {
	
	public long calculateTax(long salary) {
		long taxAmount = 0;
		if(salary > 0) {
			taxAmount = (10 * salary) / 100;
		}
		
		return taxAmount;
	}

}

