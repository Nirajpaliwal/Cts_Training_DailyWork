// program to demonstrate use of method overloading
package com.cognizant.training;

class A {
	public void display() {
		System.out.println("class A");
	}
}


class B extends A {
	@Override
	public void display() {
		System.out.println("class B");
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();

		a.display();
		b.display();
		a1.display();
	}

}
