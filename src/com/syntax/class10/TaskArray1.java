package com.syntax.class10;

public class TaskArray1 {

	public static void main(String[] args) {
		
		// From an array of integer elements find the largest number.

		
		int [] numbers= {1,7,99,236,89};
		int maxNum=numbers[0];
		
		for (int i=0;i<numbers.length;i++) {
			if (numbers[i]>maxNum) {
				maxNum=numbers[i];
			}
		}
		
		System.out.println("The largest number is "+maxNum);
		
	}

}
