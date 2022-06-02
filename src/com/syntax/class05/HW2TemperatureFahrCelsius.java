package com.syntax.class05;
import java.util.Scanner;
public class HW2TemperatureFahrCelsius {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature.
		 *  Your program should convert Fahrenheit into celsius
		 *  and print “The temperature is the city __ is __
		 * 
		 * 
		 */

		 Scanner input=new Scanner(System.in);
		System.out.println("Please input your city"); 
		String city=input.next();
		
		System.out.println("Please input your temperature");
		double temperature=input.nextDouble();
		double temperature2=(temperature-32)*5/9;
		System.out.println("The temperature is the city "+ city+ " is "+ temperature);
	}

}
