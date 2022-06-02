package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
		
		int i=100;
		double d=100;
		System.out.println(i);//100
		System.out.println(d);//100.00
		
		//Type mismatch cannot convert from double to int
		int x= (int)99.99; //narrowing, we lost 0.99
		System.out.println(x);
		
		//type mismatch cannot convert from int to byte
		
		byte b=(byte)130;
		System.out.println(b);
		
		float f=10.99f;
		double dpd=9.99;
		int price=100;
		
	}

}
