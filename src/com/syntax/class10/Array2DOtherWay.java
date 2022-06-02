package com.syntax.class10;

public class Array2DOtherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * array NY all cities of NY state
		 * array NY all cities of NY state
		 * array NY all cities of NY state
		 * array NY all cities of NY state
		 */
	
	String [][] usa= {
			
			
			{"NY", "Albany", "Buffalo"},                             // index 0
			{"LA", "San Francisco", "San Jose", "San Diego"},        // index 1
			{"Miami", "Orlando", "Niceville", "Tampa"},              // index 2
			{"McLean", "Richmond", "Leesburg" }                      // index 3
	};
	
	System.out.println(usa[1][2]); // San Jose 
	System.out.println("I want to go to "+ usa[2][0]); //Miami
	
	System.out.println("Total numbers of 1d array Usa = "+usa.length);
	
	// how may elements in my first array
	
    int elements1array= usa[0].length;
    System.out.println("Numbers of elements in 1 array "+ elements1array);
	
	
 // how may elements in my second array
    
    int columns1array= usa[1].length;
    System.out.println("Numbers of elements in 2 array "+ columns1array);
	}

}
