package com.syntax.class04;

public class TaskNestedIf3 {

	public static void main(String[] args) {
		/*
		 *  Write a program to find largest number among three numbers using nested 
		 *if provided by a user (numbers must be distinct)
	     */
		
		int num1=10;
		int num2=30;
		int num3=40;
		
		if (num1>=num2) 
		if (num1>num3) {
			System.out.println(num1+ " is the largest number among three");
		}else {System.out.println(num2+ " is the largest number among three");}
		
		else {
			System.out.println(num3+ " is the largest number of all three");
		}
		
		
		
	    }
}
	
	
		