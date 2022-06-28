package com.syntax.review01;

import java.math.BigInteger;

public class Variables {

	public static void main(String[] args) {
		
		String a="10";
		String b="20";
		//System.out.println(a*b);
		//boxes to store numbers without decimal places
		byte smallestBox=127; //-128 to 127
		short slightlyLargeBox=16665; //-32768 to 32767
		int famousBox=21455555; // most of the time you guys will use this box to store whole numbers
		long notThatFamousBox=4545454545454l; //
		BigInteger i=new BigInteger("1122522225222222222222222222222222222222222222222222222222222");
		float f=12.55555555522222222555525252f;
		double d=12.55555555522222222555525252;
		System.out.println(f);
		System.out.println(d);
		
		float f1=10.0f/3.0f;
		double d1=10.0/3.0;
		System.out.println(f1);
		System.out.println(d1);
		
		//always for whole numbers use int data type and for decimal numbers use double data type
		char letter='a';
		System.out.println(letter);
		String name="Naveed";
		String address="house # 5, Flat # 3, street 121";
		
		System.out.println("\uD83D\uDE00");
	}

}
