package com.syntax.class02;

public class HW {

	public static void main(String[] args) {
		
		//Part 1
		double entree=35.34;
		double cocktail=15.74;
		double sum, sub, mult, div;
		
		sum=entree+cocktail;
		sub=entree-cocktail;
		mult=entree*cocktail;
		div=entree/cocktail;
		System.out.println("The value of the menu prices "+entree+" and "+cocktail+" is equal to "+sum);
		System.out.println("When subtracted from each other, the menu prices for "+entree+" and "+cocktail+" is equal to "+sub);
		System.out.println("Multiplying both the prices on the menu "+entree+" and "+cocktail+" is equal to "+mult);
		System.out.println("Dividing the two menu prices "+entree+" and "+cocktail+" equals to "+div);
		
		float fries=3.9f;
		float squared=fries*fries;
		System.out.println("The square number of the number of fries, "+fries+" is "+squared);
		
		
		//Part2
		int width=5;
		int height=8;
		
		int per=width*2+height*2;
		int area=width*height;
		System.out.println("The perimeter of a rectangle with the width of "+width+" and the height of "+height+" is equal to "+per+", and the area is "+area);
		
	}
	
}
