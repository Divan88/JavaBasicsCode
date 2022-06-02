package com.syntax.class10;

public class Array2DMore {

	public static void main(String[] args) {
		//  System.out.println("All values using enhanced for loop");
	
		int [] [] nums={
				
				{1, 2, 3, 4, 5},
				{199, 349, 588, 700},
				{1900, 4578, }
		
		};
		
		// enhanced for loop to access elements from an array
		// outer loops iterates over 1d array
		// inner loop  iterates over elements of each 1D array
		
	     for (int[]num:nums) {
	    	 
	    	 for(int n:num) {
	    		 System.out.print(n+ " ");
	    	 }
	     }
	
	System.out.println();
	
	}

}
