package com.cognizant.training.thread.day18;

public class ThreadOne extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if(i % 2 != 0)
				System.out.println("Thread-1 " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}