package com.syntax.class08;

import java.util.Scanner;

public class TaskContinueKeyword {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3 
		 */

		 for (int i =1; i<=50; i++) {
			 
			 if(i%3==0) {
				 continue;
			 }
			 System.out.print(i+ " ");
		 }
		 
		 
		
		/*
		 * Create a program that will keep asking user to apply for a credit card. 
           as soon you get “yes” from a user program should stop asking.
		 */

	       Scanner scan=new Scanner(System.in);
	       String apply=" ";
	       
	       do {
	    	   System.out.println("do you want to apply for a credit card?");
	    	   apply=scan.next();
	    	   
	       } while (!"yes".equalsIgnoreCase(apply));
	       
	
	
	}
	
	
	
	

}
