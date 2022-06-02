package com.syntax.class08;

public class HWNestedLoop {

	public static void main(String[] args) {
		/*
		 * Using nested loop, create a 24 hour clock that will display 2 digits for an hour and 2 digits for a minute.
 Example:

 10:00

10:01

10:02

…
		 * 
		 */

		int hrs = 0;
		int min = 0;
		for (hrs = 0; hrs <= 23; hrs++) {
			if (hrs == 24 && min == 60) {
				System.out.println(hrs + ":" + min);
				continue;
			}
			for (min = 0; min <= 60; min++) {
				if (min < 10 & hrs < 10) {
					System.out.println("0" + hrs + ":0" + min);
				} else if (min < 10) {
					System.out.println(hrs + ":0" + min);
				} else if (hrs < 10) {
					System.out.println("0" + hrs + ":" + min);
				} else {
					System.out.println(hrs + ":" + min);
				}
			}
		}
		
	}

}
