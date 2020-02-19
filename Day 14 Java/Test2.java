package com.sample;

class A{
	A(){
		super();
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("3");
	}
	
	B(int a){
		this(); // this(2) it will give compile time error
		System.out.println("4");
	}
	
	{
		System.out.println("5");
	}
}

public class Test2 {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("-----------------");
		
		B b = new B();
		System.out.println("-----------------");
		
		B b2 = new B(5); 
	}

}
