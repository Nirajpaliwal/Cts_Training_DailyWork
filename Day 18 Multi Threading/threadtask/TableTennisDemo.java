package com.threadtask;

public class TableTennisDemo {

	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		SecondThread st = new SecondThread();
		
		System.out.println("Player 1 ready...");
		System.out.println("Player 2 ready...");
		
		ft.start();
		st.start();
	}

}
