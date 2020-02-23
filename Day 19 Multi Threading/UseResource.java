package com.cognizant.training.thread.day18;

public class UseResource implements Runnable {

	Resource resource;

	public UseResource() {
		// TODO Auto-generated constructor stub
	}

	public UseResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.display("Thread -1");

	}

}
