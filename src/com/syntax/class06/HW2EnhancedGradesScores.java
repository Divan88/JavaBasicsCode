package com.syntax.class06;
import java.util.Scanner;
public class HW2EnhancedGradesScores {

	public static void main(String[] args) {
		/*
		 * Alow user to enter grade (A, B or C..) and than provide explanation:
		 * A-Excellent, B-Very Good, C-Good, D-Average, D-Bad.., any other grade--> Not acceptable
		 * At the end of the program should print which grade was entered by a user with explanation
		 */

		Scanner scan=new Scanner (System.in);
		
		 
		System.out.println("Enter your grade");
	     char grade=scan.next().charAt(0);
        
	     String explanation;
	     switch(grade) {
	     case 'A':
	    	 explanation =" Excellent ";
	     break;
	     case 'B':
	    	 
	    	explanation=" Very Good ";
	    	break;
	     case 'C':
	    	 explanation=" Good ";
	    	 break;
	    	 
	     default:
	    	 explanation= " Not acceptable ";
	     
	     
	     
	     }
	     
		System.out.println("You are a student with "+grade+ explanation);
	}

}
