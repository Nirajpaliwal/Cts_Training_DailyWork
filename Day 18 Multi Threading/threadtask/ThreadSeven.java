package com.threadtask;

public class ThreadSeven implements Runnable {
	ResourceExample resource;
	public ThreadSeven(ResourceExample resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.tableOfTwo("Thread Seven");
	}
}
	// @Override
//public void run() {
//      for(int i=2;i<=20;i+=2)
//      {
//    	  System.out.println("Table of 2 :"+i+" ");
//      }
//      
//      try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//}
//}