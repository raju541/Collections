package com.cts.bills;

public class WaterBill extends APBill {
	
	@Override
	public int calculateBill(int units) {
	
	int amount =units*3;
	return amount;
}}
