package com.syntax.class05;
import java.util.Scanner;
public class TaskDMV {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they are 18 
		 * and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit
		 */

		Scanner scan= new Scanner (System.in);
		System.out.println("How old are you");
		int age= scan.nextInt();
		
		
		if(age>=18) {
		System.out.println("You are over 18, we will issue a driver license");
		}else {
			System.out.println("You are under 18, I recommend you a learners permit");
		}
	}

}
