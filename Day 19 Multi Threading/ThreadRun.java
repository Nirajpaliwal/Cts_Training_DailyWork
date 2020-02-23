package com.cognizant.training.thread.day18;

public class ThreadRun {

	public static void main(String[] args) {
		
		
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		Resource1 rs1 = new Resource1(t1);
		Resource2 rs2 = new Resource2(t2);
		
		rs1.start();
		rs2.start();
	}

}
