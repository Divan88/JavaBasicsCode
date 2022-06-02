package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		// continue= skips current execution/iteration

		
		for(int i=1; i<=5; i++) {
			if (i==2) {
				continue;
			}
			System.out.print(i+ " ");
			System.out.println("hello");
			System.out.println("break is soon");
		}
		
		// print number from 1 to 10 except 5 and 7
		
		for (int i=1; i<=10; i++) {
			
			if (i==5 || i==7);{
			continue;
			}
		}
		
		
		
		
		
	}

}
