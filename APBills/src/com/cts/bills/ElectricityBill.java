package com.cts.bills;

public class ElectricityBill extends APBill {
	
	
	@Override
	public int calculateBill(int units) {
		
		int amount =units*2;
		return amount;
	}

	
}
