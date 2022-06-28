package com.syntax.review02;

public class StringConCat {
	public static void main(String[] args) {
		
		String firstName="Ali";
		String lastName="Baba";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2); //1st Operation=firstName+num=>Ali10+10=>Ali1010
		System.out.println(firstName+(num+num2)); //1st Operation=(num+num2)=>10+10=>Ali+20=>Ali20
		System.out.println(num+firstName+num2); //10+Ali=>10Ali+10=>10Ali10
		
		System.out.println(num+num2);
	}

}
