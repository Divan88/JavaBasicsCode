package com.syntax.class06;
import java.util.Scanner;
public class HW1CountryLanguage {


	public static void main(String[] args) {
		/*
		 * ask user to enter their country and capture it.
		 *  Once values are captured print which language user speaks.
		 *  
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("What country are you from?");
		String language=scan.nextLine();
		
		
		switch(language) {
		   case "USA": 
			  language="English";
		   break;
		   case "Croatia":
			   language="Croatian";
		   break;
		   case "Kazahstan":
			   language="Kazakh";
			   break;
			default:   
		}
		System.out.println("You speak "+language+" language.");
		}
	}
	
	


