package com.syntax.class04;

public class TaskNestedIf2 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to check whether number is Even or Odd.

2. Create a Java program and call it a Donor.

In order to be eligible to donate your blood you have to be 18 years old.
 Also once you identify age eligibility then we have to see 
 if person matches weight requirements.
  If person weight it more than 110 lbs → then he/she is eligible,
   otherwise we cannot accept such a patient.
		 */

		int age=19;
		int height=112;
		
		if (age<18) {
			System.out.println("You are too young to donate blood ");
			}else {System.out.println("You are 18 or older and eligible to donate blood");{
				
			}
		}if (height>110) {
			System.out.println("Person is eligible to donate blood");}
			else { System.out.println("Person is not eligible to donate blood"); 		
			}{
			}
		
	}	
}

