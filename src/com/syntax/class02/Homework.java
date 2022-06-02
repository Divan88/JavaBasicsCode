package com.syntax.class02;

public class Homework {
public static void main (String[] args) {
	
	  /*
	   * 1. Write a Java program to add, subtract, multiply and divide 2 decimal values.
	   *  Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
	   */
	System.out.println("Part 1");
	
	   double o= 53.46;
	   double p= 25.28;
	   
	   
	   double add1= o+p;
	   System.out.println("The add of 2 numbers "+ o+ " and " +p + " is equal to "+ add1);
	   
	   double sub1= o-p;
	   System.out.println("The subtract of 2 numbers " +o+  " and "+p+ " is equal to " +sub1);
	
	   double mult1=o*p;
	   System.out.println("The multiply of 2 numbers "+o+ " and " +p+ " is equal to " + mult1);
	   
	   double div1= o/p;
	   System.out.println("The divide of 2 numbers "+o+ " and "+p+ "is equal to "+ div1);

	   
	   /*
         Write a program to find the square of the number 3.9. 
         You program should say “The square of the ____ is ____ ”  
        * 
	    */
	   System.out.println("Part 2");
	   
	   double sq=3.9;
       double sq2=sq*sq;
       char sym='"';
       System.out.println(sym  + "The square of the "+sq+ " is "+ sq2 + sym);
       
       /*
        * Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8. 
        * Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal 
        * to _____ and the area is __”
        * 
        */ 
			System.out.println("Part 3"); 
	   int width, height, area, perimeter;	
       width= 5;
       height=8;
       area = width*height;
       perimeter= 2*(width+height);
       char sym2= '"';
       System.out.println(sym2+ "The perimeter of a rectangle with width "+ width+ " and height "+ height+ " is equal to "+ perimeter+ " and area is " + area+ sym2 );
       
       
       
			   
	   
}
}
