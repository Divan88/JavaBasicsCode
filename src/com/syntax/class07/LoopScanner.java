package com.syntax.class07;
import java.util.Scanner;
public class LoopScanner {

	public static void main(String[] args) {
		/*
		 * we going to ask you if you get a job
		 * and we will continuously asking if you get a job until you say yes
		 * 
		 * once you say yes, Congratulation
		 */

	 Scanner scan=new Scanner(System.in);
	 
	 String job;
	 
	 do {
	 System.out.println("Did you get a job?");
	 job=scan.nextLine();
	 }	while (!job.equalsIgnoreCase("Yes"));
	 System.out.println("Congratulations");
	 
	 Scanner input=new Scanner(System.in);//using  while
	 String offer;
	 
	 System.out.println("Did you get a job?");
	 offer=input.nextLine();
	 
	 while (!input.equals("yes")) {
		 System.out.println("Didi you get a job?");
		 offer=input.nextLine();
	 }
	 System.out.println("Congratulations");
	}

}
