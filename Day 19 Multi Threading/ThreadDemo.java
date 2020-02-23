package com.cognizant.training.thread.day18;

public class ThreadDemo {

	public static void main(String[] args) {

		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2);
		
		//System.out.println(Thread.currentThread().getName());
		// Here we have only 1 thread(main)
//
//		ThreadOne threadOne = new ThreadOne(); // new born state
//		ThreadTwo threadTwo = new ThreadTwo(); // new born state
//
//		ThreadOneRunnable threadOneRunnable = new ThreadOneRunnable(); // new born state
//		ThreadTwoRunnable threadTwoRunnable = new ThreadTwoRunnable(); // new born state
//
//		Thread t1 = new Thread(threadOneRunnable);
//		Thread t2 = new Thread(threadTwoRunnable);
		
		Resource rs = new Resource();
		
		UseResource ur = new UseResource(rs);
		Thread t3 = new Thread(ur);

		UseResource2 ur2 = new UseResource2(rs);
		Thread t4 = new Thread(ur2);
		
//		t1.setPriority(t1.NORM_PRIORITY + 1);
//		t2.setPriority(t2.NORM_PRIORITY + 2);


//		threadOne.start(); // Ready state
//		threadTwo.start(); // Ready state

//		t1.start();
//		t2.start();
		
		t3.start();
		t4.start();
		
//		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
//		System.out.println("Thread 1 priority : " + t1.getPriority());
//		System.out.println("Thread 2 priority : " + t2.getPriority());

//		Thread t = Thread.currentThread();
//			
//		System.out.println(t.getName());
//		t.setName("Thread 1");
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
//		System.out.println(t.isDaemon());
//		System.out.println(t.isAlive());
//		System.out.println(t);

	}

}
