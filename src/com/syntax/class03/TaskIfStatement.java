package com.syntax.class03;

public class TaskIfStatement {

	public static void main(String[] args) {
	
		
		double val1, val2;
		
		val1=29.56;
		val2=23.55;
		if (val1>val2) {
			System.out.println("Double value "+ val1+" is larger than "+ val2);
		}
		
		int temperature=15;
		if (temperature<32) {
			System.out.println("The water will freeze with temperature "+ temperature);
			System.out.println("Put the jacket on, it's so cold");
		}else { System.out.println("Water will NOT freeze with temperature"+ temperature); 
		
		}
      System.out.println("I am code outside of block"); // we are not inside of else statement, continuous code!!
	}
}

