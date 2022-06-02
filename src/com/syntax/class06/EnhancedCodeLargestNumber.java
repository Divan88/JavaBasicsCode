 package com.syntax.class06;

public class EnhancedCodeLargestNumber {

	public static void main(String[] args) {
 
		int num1=66;
		int num2=66;
		int num3=32;
		
		/*
		 *
		 * compiler can initialize variables to it's default values
		 * int=0
		 * double 0.0
		 * boolean=false
		 * String="null"
		 * 
		 */
		
		int largest=0;
		 
		 if (num1>num2 && num1>num3) {
			largest=num1;  //System.out.println(num1+ " is the largest number");
		}else if (num2>num1&&num2>num3) {
			largest=num2;;//System.out.println(num2+ " is the largest number")
		}else if (num3>num1&&num3>num2)	{
			largest=num3; //System.out.println(num3+ " is the largest number")
		}else {
			System.out.println("all numbers are equal");
			
		}
		 
		 if (largest!=0) {
		 System.out.println("Largest number is "+ largest); // The local variable largest may not have been initialized
	}
		 }

}
