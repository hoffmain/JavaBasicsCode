package com.syntax.class14;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
	
	String s=new String("haahhaha");
	System.out.println(s.toUpperCase());
	StringBuilder st=new StringBuilder("jajajja");
	System.out.println(st.reverse());
	//String and StringBuilder both are classes that we can use to store and manipulate characters
	//But String is immutable and StringBuilder is mutable
	//when we make a lot of changes to a String it creates multiple copies inside your memory and
	//it can be very slow because for every change a new variable is created
	
	System.out.println(s);//The changes to variable is temporary. With this print it is back to original data
	System.out.println(st);//The changes are made to variable permanent
	
	}

}
