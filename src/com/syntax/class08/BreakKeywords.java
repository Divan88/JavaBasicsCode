package com.syntax.class08;

public class BreakKeywords {

	  // break - break block of code
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for(int i=1; i<=5; i++) {
			 System.out.println("Hello");
			 break;
		 }
		boolean summer=true;
		int temp=5;
		while(summer) {
			
			if(temp<70) {
				System.out.println("It is not hot anymore");
				break;
			}
			
			System.out.println("It is hot");
			break;
		}
		temp-=10;
	}

}
