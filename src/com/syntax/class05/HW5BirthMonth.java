package com.syntax.class05;
import java.util.Scanner;
public class HW5BirthMonth {

	public static void main(String[] args) {
		/*
		 * write a program for user to enter his/her's birth month.
		 * Based on the month define a season.
		 * if user is born on March, April and May it's Spring, if user is born June, July and August
		 * season=Summer, if user is born September, October and November, it is Autumn, if user is born 
		 * in December, January and February, it is Winter.
		 * at the end of the program we should see the output "You were born in season _____."
		 *
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month=scan.next();
		
		if (month.equals ("March") || month.equals("April")|| month.equals("May")){
			System.out.println("It's spring");
			System.out.println("You were born in Spring season");
    }  else if (month.equals ("June")|| month.equals("July")|| month.equals("August")) {
		    System.out.println("It's Summer");
		    System.out.println("You were born in Summer season ");
	}
     else if (month.equals("Septmeber")|| month.equals("October") || month.equals("November")){
		
    	    System.out.println("It is Autumn ");
    	    System.out.println("you were born in Autumn season ");
     } else if (month.equals("December")||month.equals("January")|| month.equals("February")) {
    	    System.out.println("It is winter");
    	    System.out.println("You were born in Winter season");
     }
     
     
     
	}
}

