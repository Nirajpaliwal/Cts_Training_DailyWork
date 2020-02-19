package com.cognizant.training;

class StaticDemo {
	int x = 10;
	static int y = 20;
}

public class StaticTest {

	public static void main(String[] args) {
		StaticDemo d = new StaticDemo();
		StaticDemo d1 = new StaticDemo();
		StaticDemo d2 = new StaticDemo();

		System.out.println(d.x);
		System.out.println(d.y);

		d2.x = 50;
		d1.y = 30;

		System.out.println();

		System.out.println(d.x);
		System.out.println(d2.y);

	}
}
