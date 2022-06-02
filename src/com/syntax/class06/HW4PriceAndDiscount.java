package com.syntax.class06;
import java.util.Scanner;
public class HW4PriceAndDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale? ");
		String sale = input.nextLine();
		if (sale.equals("Yes") || sale.equals("yes")) {
			System.out.println("Which item would you like to buy? ");
			String item = input.nextLine();
			System.out.println("What is the prices of an item? ");
			int price = input.nextInt();
			int discountedPrice = 0;
			int discount = 0;
			if (price < 20) {
				discount = 10;
				discountedPrice = price - (price * discount / 100);
			} else if (price >= 20 && price < 100) {
				discount = 20;
				discountedPrice = price - (price * discount / 100);
			} else if (price >= 100 && price < 500) {
				discount = 30;
				discountedPrice = price - (price * discount / 100);
			} else if (price > 500) {
				discount = 50;
				discountedPrice = price - (price * discount / 100);
			}
			System.out.println("After discount of " + discount + "% the price of " + item + " reduce from " + price
					+ "$ to " + discountedPrice + "$.");
		}
		else if (sale.equals("No") || sale.equals("no")) {
			System.out.println("You are not going shopping.");
		}
	}

}
