package com.syntax.class03;

public class RelationOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// >, <, >=, <=, ==, 1=
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2); //false
		System.out.println(num1<num2); //true
		
		System.out.println(num1==num2); // no=false
		System.out.println(num1=num2); //22, replacing from num1 to num2, 20 to 22
		
		System.out.println(num1==num2); // true, num1 and num2 are the same becuase we reassign the value of num1result
		
		boolean result=100>200;
		System.out.println(result);
		
		int result1=100+200;
		String result2="Eva"+10;	
		
		int num3=10;
		int num4=11;
		
	   result=num3==num4;
	   System.out.println(result); // false, its not equal
	   
	   result= num3!=num4;
	   System.out.println(result); // it's NOT (!) equal to 
	   
	   
	   
		
	}

}
