package com.syntax.class05;
import java.util.Scanner;
public class HW4CurrentTime {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to input inputs the current time
		 *(use 24 hour format). 
		 *Based on a given time define:
		 *if hour is between 1-11--> Morning
		 *if hours is between 12-15--> Afternoon
		 *if hours between 16-20 -->Evening
		 *if hour between 21-24--> Night
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please input the current time");
		double time=scan.nextDouble();
		if (time!=1 && time>=1 && time <=11) {
			System.out.println("It's morning");
		}else if(time>=12 && time<=15) {
			System.out.println("It's afternoon");
		}else if(time>=16 && time<=20) {
			System.out.println("It's evening");
		}else if(time >=21 && time<=24)  {
			System.out.println("it's night");
		}
	else {
		System.out.println("It's a invalid");
	}
	}

}
