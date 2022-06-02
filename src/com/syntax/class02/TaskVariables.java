package com.syntax.class02;

public class TaskVariables {

	public static void main(String[] args) {
		
		String name= "Ivan";
		String lastName= "Johnson";
		char symbol = 'A';
		String city= "Amsterdam";
		long phoneNumber= 65638385939L;
		String state= "The Nederalands";
	
		System.out.println("My name is " + name+ " and my last name is " + lastName );
		System.out.println("I am " + symbol+ " student");
		System.out.println("I live in a city called "+ city + " and state called " + state);
		System.out.println("and my phone number is "+ phoneNumber );
		
		
		name="Luka";
		city="Seattle";
		state="Washington";
	    phoneNumber= 23429382899832L;
		
       System.out.println("My name is " + name+ " and I move to new city "+ city + " and new state " + state + 
		  ". " + "My new phone number is " + phoneNumber);
       
       
       
	}

}
