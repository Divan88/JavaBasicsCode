package com.syntax.class10;

public class Array2DLoopCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] usa= {
				
				
				{"NY", "Albany", "Buffalo"},                             // index 0
				{"LA", "San Francisco", "San Jose", "San Diego"},        // index 1
				{"Miami", "Orlando", "Niceville", "Tampa"},              // index 2
				{"McLean", "Richmond", "Leesburg" }                      // index 3
		};
	
	
		for(String [] states:usa) {
			for(String city:states) {
			System.out.print(city+ " ");	
			}
		System.out.println();
		}
	}

}
