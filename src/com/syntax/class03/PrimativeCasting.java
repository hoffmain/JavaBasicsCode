package com.syntax.class03;

public class PrimativeCasting {
	
	public static void main(String [] args) {
		
		//ctrl+space --> auto completes
		
		int i=100;
		double d=100;//widening happens automatically
		
		System.out.println(i);//100
		System.out.println(d);//100.0
		
		long l=10000;
		
		//byte b=130; error: cannot convert from int to byte
		//int x=99.99 error: cannot convert from double to int
	
		int x=(int)99.99;//narrowing causes information to be lost
		System.out.println(x);
		
		byte b=(byte)130;
		System.out.println(b);
		
		//Type mismatch: cannot convert from double to float
		float f=10.99f;
		
		double dd=9.99;
		
		double price=100;
		
		
		
		
	}

}
