package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// declare 2 numbers and verify which one is the largest
		
		int num1=30;
		int num2=20;
		
		if(num1>num2) {
			System.out.println(num1+ " is larger than "+num2);
			
		}else if (num2>num1){
		System.out.println(num2+ " is larger than "+num1);
		
		}else {
			System.out.println(num1+ (" is equal to "+num2));
		}

		
		System.out.println("__________________________________________________-");
		
		int month=11;
		
		if (month==1) {
		System.out.println("January");
		}else if (month==2) { 
	    System.out.println("February");
		}else if (month==3) {
		System.out.println("March");
        }else if (month==4) {
        System.out.println("April");
        }else if (month==5) {
        System.out.println("May");
        }else if (month==6) { 
        System.out.println("June");
        }else if (month==7) {
        System.out.println("July");
        }else if (month==8) {
        System.out.println("August");
        }else if (month==9){
        System.out.println("September"); 
        }else if (month==10) {
        System.out.println("October");
        }else if (month==11) {
        System.out.println("November");
        }else if (month==12) {
        System.out.println("December");
        }
		
	System.out.println("____________________________________________-");
	
	boolean mothersDay=true;
	if (mothersDay==true) {
    System.out.println("Happy Mother's day");
	
	}else {
	System.out.println("Hello");	
	}
	
	}
}