package com.cts.bills;

public class Gasbill extends APBill{
	@Override
	public int calculateBill(int units) {
		
		int amount =units*1;
		return amount;
	}
}
