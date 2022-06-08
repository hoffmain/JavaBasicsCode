package com.syntax.class11;

public class Dog {
	
	String name;
	String color;
	int age;
	int weight;
	
	void eat() {
		System.out.println("Dog eats food");
	}
	void sleep() {
		System.out.println("Dog sleeps");
	}
	void bark() {
		System.out.println("Dog barks");
	}
	
	public static void main(String[] args) {
		
		Dog husky=new Dog();
		
		husky.name="Pepper";
		husky.color="red/white";
		husky.age=3;
		husky.weight=48;
		husky.bark();
		
		Dog bulldog=new Dog();
		
		bulldog.name="Tank";
		bulldog.color="lavender";
		bulldog.age=6;
		bulldog.weight=52;
		bulldog.sleep();
		
		Dog labrador=new Dog();
		
		labrador.name="Hank";
		labrador.color="yellow";
		labrador.age=8;
		labrador.weight=62;
		labrador.eat();
		
	}
}
