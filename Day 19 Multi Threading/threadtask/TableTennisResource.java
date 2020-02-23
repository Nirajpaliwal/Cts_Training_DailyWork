package com.threadtask;

public class TableTennisResource {
	public void player1(String name) {
		synchronized (this) {
			int num = 2;
			System.out.println("Ping->");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void player2(String name) {
		synchronized (this) {
			int num = 4;
			System.out.println("<-Pong");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}