package com.syntax.class02;

public class NonprimitiveType {

	public static void main(String[] args) {
		
		//String- group of multiple character 
		
	String	name="Eva";
	
	String lastName="Smith";
	
	String city= "New York";
	
	long phone=1234567890L;
	
	String phoneNumber="123-456-7890";
	
	String address="55 Park Ave";
	
	int age=10;
	
	System.out.println(name+ " " + lastName); // Eva Smith
	System.out.println(name+" "+ "lives in "+ city); // Eva lives in New York
	System.out.println(name+ " "+ lastName+ " lives in "+ city + " she's "+ age );  //Eva Smith lives in New York she's 10
	
	}

}
