package com.syntax.class06;
import java.util.Scanner;
public class HW3CreateCalculator {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		int num1, num2, result;
		String calc;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1=input.nextInt();
		System.out.println("Enter symbol: + - * /");
		calc=input.next();
		System.out.println("Enter second number");
		num2=input.nextInt();
		
		switch(calc) {
		
		case "+":
			result= num1+num2;
			break;
		case "-":
			result= num1-num2;
			break;
		case "*":
			result= num1*num2;
			break;
		case "/":
			result= num1/num2;
			break;
		default:
			result=0;
			break;	
		
		}
		
		System.out.println("The result is "+result);
	}

}
