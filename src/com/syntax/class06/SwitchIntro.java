package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {

		// ovo je od IfElseIF u class 4
		
        int day=7;
        String name;
		
		if (day==1) {
		     name="Monday"; //System.out.println("January"
		}else if (day==2) {  
	        name="Tuesday"; //System.out.println("February"
		}else if (day==3) {
		     name="Wednesday";//System.out.println("March)"
        }else if (day==4) {
             name="Thursday";
        }else if (day==5) {
             name="Friday";
        }else if (day==6) { 
            name="saturday";
        }else if (day==7) {
            name="Sunday" ;}
    else {
    	name="Invalid day";
    }
		System.out.println("today is "+name);
		
		
		System.out.println("__________________________");
		
		switch (day) {
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7 :
			name="Sunday";
			break;
		
		}
		System.out.println("today is "+ name);
	}

}
