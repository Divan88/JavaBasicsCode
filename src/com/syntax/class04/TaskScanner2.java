 package com.syntax.class04;
import java.util.Scanner; 
public class TaskScanner2 {

	public static void main(String[] args) {
	
		/*
		 * Create a java program in which using Scanner you are going
		 *  to capture 2 numbers.
             And once you capture 2 numbers,
              please check which one is the largest.
         * 
		 */

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Give me a number please!");
		int number1= scanner.nextInt();
		System.out.println("Give me another number, please!");
		int number2= scanner.nextInt();
		
		if (number1>number2) {
			System.out.println(number1+ " is larger than "+ number2);
		}else {
			System.out.println(number2+ " is larger than "+ number1);
		}
		
	}

}
