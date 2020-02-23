package com.cognizant.training.thread.day18;

public class Thread1 implements Runnable {

	Resource1 resource1;

	public void Thread1() {
		// TODO Auto-generated constructor stub
	}

	public Thread1(Resource1 rs1) {
		this.resource1 = rs1;
	}
	
	@Override
	public void run() {
		resource1.display();
	}
}