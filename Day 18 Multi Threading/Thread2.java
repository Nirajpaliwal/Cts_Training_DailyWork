package com.cognizant.training.thread.day18;

public class Thread2 implements Runnable {

	Resource2 resource2;

	public void Thread2 {
		// TODO Auto-generated constructor stub
	}
	
	public void Thread2(Resource2 rs2) {
		this.resource2 = rs2;
	}

	@Override
	public void run() {
		resource2.display();

	}
}
