package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for (int i=1; i<6; i++) {
			System.out.print(sum+ " ");   // 0, 1, 3, 6, 10
			sum+=i;
		}
		System.out.println();
		
		/*
		 *  write a program to find sum of all even 
		 *  and all odd numbers from 1 to 70
		 */
		
		for (int e=2; e<=70; e+=2) {
			System.out.print(e+ " ");
		}
		System.out.println();
		// odd numbers
		
		for(int o=1; o<70; o+=2) {
			System.out.print(o+ " ");
		}
		
		// ANOTHER WAY
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=1; i<=70; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		
	}  


}
