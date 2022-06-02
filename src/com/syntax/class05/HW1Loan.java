package com.syntax.class05;
import java.util.Scanner;
public class HW1Loan {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user
		 *  what is the amount of loan is needed.
		 *   If loan is less or equal to 200,000
		 *    then you would lend the money 
		 *    otherwise you would reject the client.
		 * 
		 * 
		 */

		 Scanner scan= new Scanner(System.in);
		 System.out.println("What is the amount of loan you needed");
		 int loan=scan.nextInt();
		 
		 if (loan<=200000) {
			 System.out.println("I would like to land you the money.");
		 }else if(loan>20000) {
			 System.out.println("We have to reject you, the amount is to high");
		 }
		
	}

}
