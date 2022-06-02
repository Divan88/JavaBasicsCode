package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10

		
		int num=1;
		
		while (num<=10) {
			
			System.out.print(num+ " ");
			num++;
		}
		System.out.println();
		
		int num1=0;
		while(num1<=10) {
			num1++;
			System.out.print(num1+" ");
		}	
			System.out.println();
			
			
		int b=5;
		
		while(b>=1) {
			System.out.print(b+" ");
			b--;
			
			}
		System.out.println();
		//print number from -1 to -10
		int d=-1;
		while (d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		System.out.println();
		
		//print number from 1 to 20 but only even numbers
		 //1 way
		int k=2;
		while(k<=20) {
			System.out.print(k+" ");
			k+=2;
		}
		System.out.println();
		//2 way
		int f=1;
		while(f<=20) {
			
			if(f%2==0) {
			System.out.print(f+" ");
			}f++;
		}
		
		}
			
		
		
	}


