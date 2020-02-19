// demonstration of final keyword

package com.cognizant.training;

class Demo {
	public final int AGE;

	Demo() {
		AGE = 20;
	}
	
	Demo(int a, int b) {
		AGE = 20;
	}
	
	Demo(int a, int b, int c) {
		AGE = 20;
	}
}

public class finalDemo {

	public static void main(String[] args) {
		Demo d= new Demo();
		System.out.println(d.AGE);

	}

}
