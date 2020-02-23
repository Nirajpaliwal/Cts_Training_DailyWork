package com.threadtask;

public class ResourceExample {
	public void tableOfTwo(String name) {
		synchronized (this) {
			int num = 2;
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i + "-->" + name);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void tableOfFour(String name) {
		synchronized (this) {
			int num = 4;
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i + "-->" + name);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}