package com.syntax.class05;
import java.util.Scanner;
public class HW3WorkedYearsAnnualSalary {

	public static void main(String[] args) {
		
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary
		 * If user worked for more or equals to 5 years than user is eligible for the bonus
		 * otherwise he is not. Once user is eligible and salary is larger than 50000
		 * than bonus=5000, otherwise= 3000.
		 * 
		 */
  
		 Scanner scan=new Scanner(System.in);
		 System.out.println("How many years have you been working?");
		 int year=scan.nextInt();
		 System.out.println("How much is your annual salary");
	     int salary=scan.nextInt();
	     
	     if (year>=5) {
	    	 System.out.println("You are available for the bonus");
	    	 if (salary>50000) {
	    		 System.out.println("You are avaliable for bonus of 5000");
	    	 }else {
	    		 System.out.println("You are available for bonus of 3000");
	    	 }
	     }
	     
	     else {
	    	 System.out.println("You are not eligible for a bonus");
	     }	 
	     }
	     }
	     
	     
	


