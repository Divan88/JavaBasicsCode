package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] usa= {
						
				{"NY", "Albany", "Buffalo"},                             // index 0
				{"LA", "San Francisco", "San Jose", "San Diego"},        // index 1
				{"Miami", "Orlando", "Niceville", "Tampa"},              // index 2
				{"McLean", "Richmond", "Leesburg" }                      // index 3
		};
		
		// outer loop iterates over rows
		
		for (int row=0; row<usa.length; row++) {
			 
			for (int col=0; col<usa[row].length; col++)    {  // inner loop iterate over columns
				System.out.println(usa[row][col]);
			}                                         
		}
	
	System.out.println();
	
	
	
	
	}

}
