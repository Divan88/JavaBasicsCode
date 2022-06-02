package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * declare a variable rate
		 * If rate is more than 5 --> i am not nuying a house
		 */
		
		
		double mortgageRate=4.5;
		
		if(mortgageRate<5) {
			
			System.out.println("I am not buying a house");
		}
		
		int num1=99;  // declare 2 variables, if num1 is bigger than num2
		int num2=10;
		
		if(num1>num2) {
			System.out.println(num1+ " is bigger than "+num2);
		}
		
		// declare temperature, if temperature is higher than 75F --> i will go for a walk
		
		int temp=78; //if this i less than 75, result will be else--> I am going to study Java
		
		if(temp>75) {
			System.out.println("I will go for a walk");
		}else {
		System.out.println("I am going to study Java");
		
		}
		// comparing to two char
		char gender='f'; //if we changing that into m (male) its going to change to else
		if (gender=='f') {
			System.out.println("You like shopping");
		}else {
			System.out.println("you like to watch sport becuse you are a male");
		}
		// string 
	 String browser="Chrome";
	 if (browser.equals("Chrome")) { // if we change something other than "Chrome", its ging to else statement
		 System.out.println("all the test cases will be executed on Chrome");
	 }else {
		 System.out.println("I am not executing any test cases");
		 System.out.println("reason-wrong browser");
	 }
	 
		}

}
