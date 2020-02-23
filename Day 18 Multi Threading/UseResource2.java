package com.cognizant.training.thread.day18;

public class UseResource2 implements Runnable {

	Resource resource;

	public UseResource2() {
		// TODO Auto-generated constructor stub
	}

	public UseResource2(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.display("Thread -2");

	}
}
