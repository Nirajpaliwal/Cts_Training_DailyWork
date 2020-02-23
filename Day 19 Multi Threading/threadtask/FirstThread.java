package com.threadtask;

public class FirstThread extends Thread {
	@Override
	public void run() {
		synchronized (this) {
			while(true)
			{
				System.out.println("Ping->");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}
}
