package com.cts.bills;

public class Test {

	public static void main(String[] args) {
		Bill bill=null;
		bill=new ElectricityBill();
		int ebamount=bill.calculateBill(100);
		bill.printbill(ebamount);
		
		bill=new Gasbill();
		int gasbillamount=bill.calculateBill(100);
		bill.printbill(gasbillamount);
		
		bill=new WaterBill();
		int waterillamount=bill.calculateBill(100);
		bill.printbill(waterillamount);
		
		// TODO Auto-generated method stub

	}

}
