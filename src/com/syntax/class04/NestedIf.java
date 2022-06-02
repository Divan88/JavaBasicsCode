package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
	  /*
	   * if (boolean expression) { //outer if
	   * code A
	   * 
	   * if (boolean expression)   {//nested/inner
	   * 
	   * code B
	   */
   
		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("Let me check if you got a second dose");
		
		if(dose==1) {
			System.out.println("You need one more shoot");
			
		}else {
			System.out.println("You are fully vaccinated");
		
		}
		
	}
		
		System.out.println("___________________________");
		
		String month="June";
		int day=9;
		
		if (month.equals ("May")) {
			System.out.println("Let me check what is today's date");
			      if(day==8) {
			System.out.println("Today is a mother day");}
			
			}else if (month.equals("June")) {
				System.out.println("Let me check day in June");
				
				  if (day==19) {
					  System.out.println("Today is a fathers day");
				  }
			}
	}
					
}
