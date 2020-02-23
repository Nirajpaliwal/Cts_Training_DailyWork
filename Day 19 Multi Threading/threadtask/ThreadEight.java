package com.threadtask;

public class ThreadEight implements Runnable{
	ResourceExample resource;
	public ThreadEight(ResourceExample resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.tableOfFour("Thread Eight");
	}
}