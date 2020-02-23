package com.cognizant.training.thread.day18;

public class Resource1 {
	public void display() {
		System.out.println("Table 1");
		synchronized (this) {
			int i;
			int num = 2;
			for (i = 1; i <= 10; i++) {
				System.out.println(num + "  * " + i + " = " + num * i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
