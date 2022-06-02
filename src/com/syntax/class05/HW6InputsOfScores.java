package com.syntax.class05;
import java.util.Scanner;
public class HW6InputsOfScores {

	public static void main(String[] args) {
		/*
		 * Write a program that will write three inputs of scores 
		 * (quiz,mid-term, final scores)
		 * and determine the grade based on the following rules:
		 * if the average score >=90--> grade A
		 * if the average score >=70 and <=90 -->grade B
		 * if the average score >=50 and <=70 -->grade C
		 * if the average score <50 --> grade C
		 * 
		 */

		 Scanner scan=new Scanner(System.in);
		 System.out.println("What is your quiz score?");
		int score1=scan.nextInt();
		System.out.println("What is your mid-term score");
		int score2=scan.nextInt();
		System.out.println("What is your final score");
		int score3=scan.nextInt();
		
		int result = ((score1+ score2 +score3)/3);
		 
		
		if(result>=90) {
			    System.out.println("You are grade A");
				
		}else if (result>=70 && result<=90) {
				System.out.println("you are grade B");
		}else if (result>=50 && result<=70) {
			    System.out.println("You are grade C");
		}else if(result<50) {
			    System.out.println("You are grade F");
		}
		 
		 
		 //if you are student A or B --> you are doing great, otherwise --> please study more
		 
		 
		 
	}

}
