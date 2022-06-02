package com.syntax.class09;

public class HWArraySumNumbers {

	public static void main(String[] args) {
		
		// create an array on integers and calculate the sum of all elements in an array
		
		int [] number=new int[4];
		
		number[0]=15;
		number[1]=25;
		number[2]=35;
		number[3]=45;
 
		  System.out.print(number[0]+number[1]+number[2]+number[3]);
	
	System.out.println();
	
	int[] num= {15, 25, 35, 45 };
	int sum = 0;
	
	for(int n=0; n<num.length; n++) {
		 
		 sum= sum+num[n];
		 }
	
		 System.out.println("Sum off all elements are "+ sum);
	
		 
		 sum=0;   // declaration and reasignment
		 
		 for(int number1:num) {
			 sum+=number1;
		 }
		 System.out.println("Sum off all elements are "+ sum);
	}
	

}
