package com.syntax.class09;

public class HWArrayDoubleValues {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then print all elements using 2 different loops
		 */
		
     double [] value = {35.85, 60.42, 100.45, 33.88};
		
     for (double val:value) {
    	 System.out.print(val+ " ");
     }
	System.out.println();
	
	double [] value1 = {35.85, 60.42, 100.45, 33.88};
	
	for(int v=0; v<value1.length; v++) {
		System.out.print(value1[v]+ " ");
	}
	}

}
