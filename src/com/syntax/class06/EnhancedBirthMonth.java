package com.syntax.class06;
import java.util.Scanner;
public class EnhancedBirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month=scan.next();
		
		String season = null; 
		if (month.equals ("March") || month.equals("April")|| month.equals("May")){
			season="Spring";
    }  else if (month.equals ("June")|| month.equals("July")|| month.equals("August")) {
		    season="Summer";
	}
     else if (month.equals("Septmeber")|| month.equals("October") || month.equals("November")){
		
    	    season="Autumn";
     } else if (month.equals("December")||month.equals("January")|| month.equals("February")) {
    	    season="Winter";
     }else {
    	 System.out.println("season is invalid");
     }
		System.out.println("You were born in "+season);
	}

}
