package com.syntax.class10;

public class Array2DayInteeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("All values using enhanced for loop");
	int [] [] nums={
		
		{1, 2, 3, 4, 5},
		{199, 349, 588, 700},
		{1900, 4578, }
	};
	
	for (int i=0; i<nums.length; i++) {       // i loop iterates over rows, nums.length gives number of arrays inside 2d array=3
		
		for (int j=0; j<nums[i].length; j++) {
			System.out.print(nums [i][j]+ " ");
		}
		System.out.println();
	}
	
	}
}

