package com.cts.training.day22;

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Hello Runnable");
		Thread thread = new Thread(r);
		thread.start();

		Hi h = () -> "Hi";
		System.out.println(h.greeting());
	}

}

@FunctionalInterface
interface Hi {
	String greeting();

	//public void display();
}