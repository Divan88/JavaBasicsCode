package com.syntax.class04;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		/*
		 * Create a java program in which using Scanner you are going to capture user’s
		 *  first name, last name and state where he/she lives.
		 */

		  Scanner scanner= new Scanner (System.in);
		  
		  System.out.println("What is your name?");
		  String name= scanner.nextLine();
		  
		  System.out.println("Hello "+name);
		  
		  System.out.println("What is your last name?");
		  String lastName=scanner.nextLine();
		  System.out.println("Your last name is "+lastName);
		  
		  System.out.println("Where do you live?");
		  String city= scanner.nextLine();
		  System.out.println("You live in "+ city );
		  
	}

}
