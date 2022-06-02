package com.syntax.class09;

public class Array4Task {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */

		char[] grades= new char [6];
		grades[0]= 'A';
		grades[1]= 'B';
		grades[2]= 'C';
		grades[3]= 'D';
		grades[4]= 'E';
		grades[5]= 'F';
		
		System.out.println("Your grade is "+ grades[1]);
		
		
		char[]grade= {'A', 'B', 'C', 'D', 'E', 'F'	};
		System.out.println("Your grade is "+ grade[1]);
		/*
		 *  Create an array of words: Java, Saturday, day, coding, is.
		 *  Print the following sentence using elements of array: “Saturday is Java coding Day”
		 *
		 */
		
		String [] words= {" Java ", "Saturday ", " day ", "coding ", " is" };
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		 
		
		
	}

}
