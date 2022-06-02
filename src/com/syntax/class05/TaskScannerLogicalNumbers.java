package com.syntax.class05;
import java.util.Scanner;
public class TaskScannerLogicalNumbers {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number and than define if number is small, medium,
		 * or large. Small number is value between 1 and 10, medium number is value 
		 * between 11 and 100, large number is value between 101 and 1000
		 * 
		 */
  
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		if (num>=1 && num<=10) {
			System.out.println("it's a small number");
		}else if (num>=11 && num<=100 ) {
			System.out.println("It's a medium number");
		}else if (num>=101 && num<=1000){
			System.out.println("It's a large number");
		}
	}
	}


