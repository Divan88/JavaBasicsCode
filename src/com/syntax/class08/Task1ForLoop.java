package com.syntax.class08;

public class Task1ForLoop {

	public static void main(String[] args) {
		
		
		// Print numbers from 1 to 100 in 1 line with space

		for (int i=1; i<=100; i+=2) {
			System.out.print(i+ " ");
		}
		System.out.println();
		//Print numbers from 100 to 1
		for(int j=100; j>=1; j--) {
			System.out.print(j+ " ");
		}
		System.out.println();
		// Print even numbers from 20 to 1 (2 ways)
		for (int k=20; k>=1; k-=2) {      //first way
			System.out.print(k+ " ");
		}
		System.out.println();
		
		for (int m=20; m>=1; m--) {     // second way
			
			if(m%2==0) {
				System.out.print(m+" ");
			}
		}
		// Print odd numbers between 20 and 50 (2 ways)
		System.out.println();
		
		for (int i=21; i<50; i+=2) {   // one way
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for (int i =20; i<50; i++) {
			if (i%2 !=0) {
				System.out.print(i+ " ");
			}
		}
	}

}
