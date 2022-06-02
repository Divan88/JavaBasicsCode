package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
	
		
		int num=100;
		num=num+100;
		
		System.out.println(num);//200
		
		num=num+50;
		System.out.println(num); //250
		
		num+=100;// num=num+100
		
		num-=10; //num=num-10
		System.out.println(num);//340
		
		num/=10; //34
		
		num*=2; // 34*2=68
		System.out.println(num);

		num%=2; //0
		System.out.println(num);
		
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b; //a+b=30
		System.out.println(a);// 30
		
		a+=b+c; //a+b+c; 30+20+30=80
		System.out.println(a);//80
		
		a*=10; //80*10=800
		System.out.println(a);
		
	}

}
