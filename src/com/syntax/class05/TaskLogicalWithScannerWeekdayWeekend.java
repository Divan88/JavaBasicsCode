package com.syntax.class05;
import java.util.Scanner;
public class TaskLogicalWithScannerWeekdayWeekend {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether if it is a weekend or weekday
		 * If any day from (1-5)->output "It's  weekday", anyday from 6-7->
		 * " It's a weekend, 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("What is the day of the week today?");
		int d =scan.nextInt();
		
		if (d>=1 && d<=5) {
			System.out.println("It's a weekday");
		}else if (d>=6 && d<=7) {
			System.out.println("It's a weekend");
		}else {
			System.out.println("It's an ivalid day");
		}
		
		
	}

}
