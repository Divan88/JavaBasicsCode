package com.syntax.class09;

public class ArrayRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] disney= {"Shrek", "Elsa", "Goffy", "Mickey"};
	
		System.out.println(disney[1]); // Elsa
		
		// to get all the element from an array
		
		for(int i=0; i<disney.length; i++) {
			System.out.print(disney[i]+ " ");
			if (disney[i].equalsIgnoreCase("Shrek"));
		
		}
	System.out.println();
	System.out.println("all elements using regular for loop-----");
	
	for(String character:disney) {
		
		if(character.equalsIgnoreCase("Mickey")) {
			System.out.print(character+ " is my favorite charachter");
			
		}else {
				System.out.println(character+ " ");
			}
		}
	
	} 
	
	// using if condition
	
	
	
	}

