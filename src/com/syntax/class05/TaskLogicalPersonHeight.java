package com.syntax.class05;
import java.util.Scanner;
public class TaskLogicalPersonHeight {

	public static void main(String[] args) {
		/*
		 * prompt the user to enter person heights in inches.
		 * Person should be classified as one of the following:
		 * short(under 60 inches), medium(between 60-72 inch)
		 * tall (over 72 inches)
		 */
     Scanner scan=new Scanner(System.in);
     System.out.println("Please enter your height in inches");
     int h=scan.nextInt();
     
     if (h<60) {
    	System.out.println("You are short height"); 
     }else if(h>60 && h<72) {
    	 System.out.println("You are medium height");
     }else if (h>72){
    	 System.out.println("You are tall height");
     }
    
    
     
		
	}

}
