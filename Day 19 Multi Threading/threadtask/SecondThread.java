package com.threadtask;

public class SecondThread extends Thread {
	@Override
	public void run() {
		synchronized (this) {
			while (true) {
				System.out.println("<-Pong");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
