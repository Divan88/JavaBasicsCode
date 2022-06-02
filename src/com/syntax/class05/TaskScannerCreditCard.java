package com.syntax.class05;
import java.util.Scanner;
public class TaskScannerCreditCard {
/*
 * 
2. Create a Java program that will ask if user has a credit card or not.
 If you user does not have a credit card then offer them
 *If they do have one ask what is balance on the card?
 * If balance of the card is larger than 1000
 * tell them to pay off immediately, otherwise you can tell them that they can spend more.
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		
		Scanner card=new Scanner(System.in);
		System.out.println("Do you have a credit card! Yes or No?");
		String answer=card.next();
		
		if(answer.equals("no")) {
			System.out.println("we will offer you a credit card");
		}else {
			System.out.println("Whats is a balance on your card");
			int balance=card.nextInt();
			if (balance>1000) {
				System.out.println("You can spend  more");
			}else {
				System.out.println("You need to pay off immediately");
				
			}
		}
	}

}
