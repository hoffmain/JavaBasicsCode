package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		num=num+100;
		System.out.println(num);//200
		
		num=num+50;//num+=50
		System.out.println(num);//250
		
		num+=100;//num+num+100, take variable and add 100
		
		num-=10;//num=num-10
		System.out.println(num);//340
		
		num/=10;//34
		num*=2;//68
		System.out.println(num);
		
		num%=2;
		System.out.println(num);//0
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a);//30
		
		a+=b+c;//a=a+b+c
		System.out.println(a);//80
		
		a*=10;
		System.out.println(a);//800
		
		int v=50;
		v+=500;
		v+=200;
		System.out.println(v);
		
		int o=100;
		o-=60;
		System.out.println(o);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int cake=25;
		cake%=7;
		System.out.println(cake);
		
		
		
		
	}

}
