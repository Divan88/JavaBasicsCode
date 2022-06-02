package com.syntax.class10;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to create 2d array we specify the number of rows and columns 
		
		int[] []numbers=new int[3][4];
		// 1st row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2 row
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][3]=4;
	
		// 3 row
		
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][3]=6;
		
		System.out.println(numbers[1][3]);  //4
		
		System.out.println(numbers[0][1]);  //20
		
		int rows=numbers.length; // gives a number of 1d arrays ROWS
	System.out.println(numbers.length);	  // number of rows
	
	   
	int columsof1row= numbers[0].length;
	
	System.out.println("Number of cols in 1 row = "+ columsof1row);
	
	System.out.println(" ==================================================================");
	
	
	
	
	
	
	}

}
