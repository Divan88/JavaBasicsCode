package com.syntax.class09;

public class HWArrayAnimals {

	public static void main(String[] args) {
		/*
		 * create an array of animals and store 5 elements into it, Using 2 different
		 * loops print all elements from the array
		 */

	   String [] animals= {"Ant", "Cat", "Dog", "Horse", "Bird"};
	   
	   for (String ani:animals) {
		   System.out.print(ani+ " ");
	   }
	System.out.println();
	
	String [] animals1= {"Ant", "Cat", "Dog", "Horse", "Bird"};
	
	for(int i=0; i<animals1.length; i++) {
		System.out.print(animals[i]+" ");
	}
	}
	
	

}
