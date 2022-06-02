package com.syntax.class09;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// create an array
		
		int [] b=new int[4];
		
		// store values
		
		b [0]=90;
		b [1]=85;
		b [2]=70;
		b [3]=100;
		
		// access values from my array
		
		System.out.println(b[2]);  // 70
		System.out.println(b[1]+b[3]); //185
		
		System.out.println("--------------------------------------------");
		// we need to create an array of my classmates names
		// when we create an array we MUST specify the size (how many elements)
		
		String [] classMates=new String [5];
		// how values are stored --> stored based on index
		classMates[0]= " Christina ";
		classMates[1]= " Eva ";
		classMates[2]= " Tony ";
		classMates[3]= " Dana ";
		classMates[4]= " John ";
		
		System.out.println("My classmate name is "+classMates[3]);
	}

}
