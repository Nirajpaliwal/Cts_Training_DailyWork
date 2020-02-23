package com.threadtask;

public class ThreadDemoFour {
	public static void main(String[] args) {
		
		ResourceExample rese = new ResourceExample();
		
		ThreadSeven seven = new ThreadSeven(rese);
		ThreadEight eight = new ThreadEight(rese);
		
		Thread obj = new Thread(seven);
		Thread obj2 = new Thread(eight);
		
		obj.start();
		obj2.start();
	}
}