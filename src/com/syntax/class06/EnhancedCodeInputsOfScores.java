package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCodeInputsOfScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		 System.out.println("What is your quiz score?");
		int score1=scan.nextInt();
		System.out.println("What is your mid-term score");
		int score2=scan.nextInt();
		System.out.println("What is your final score");
		int score3=scan.nextInt();
		
		int result = ((score1+ score2 +score3)/3);
		System.out.println("Youre average score is "+result);
	
         char grade;
	    if (result>=90) {
	    	grade='A';
	    }else if (result>=70 && result<=90) {
	    	grade='B';
	    }else if (result>=50 && result<=70) {
	    	grade='C';
	    }else {
	    	grade='F';
	    }
	    System.out.println("You are a "+grade+ " student");
	
	
	/*
	 * //if you are student A or B --> you are doing great, otherwise --> please study more
		 
	 */
       if (grade=='A'|| grade=='B'){
    	   System.out.println("You are doing great");
       }else {
    	   System.out.println("please study more");
       }
}
}