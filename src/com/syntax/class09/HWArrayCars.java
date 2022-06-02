package com.syntax.class09;

public class HWArrayCars {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

	String []cars= {"Audi", "Toyota", "BMW", "Tesla", "Ford", "Mercedes"};
	
	for (int i=0; i<cars.length; i++) {
		System.out.print(cars[i]+ " ");
	}
	
	System.out.println();
	String []cars1= {"Audi", "Toyota", "BMW", "Tesla", "Ford", "Mercedes"};
	
	for(String car:cars1) {
		System.out.print(car+ " ");
	}
		
	}
	
	}


