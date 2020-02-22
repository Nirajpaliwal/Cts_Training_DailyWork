package com.cognizant.training.filehandling.day18;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console c = System.console();
		System.out.print("Enter your name: ");
		String name = c.readLine();
		System.out.print("Enter your Password: ");
		char ch[] = c.readPassword();
		String password = String.valueOf(ch);

		if (name.equals("krishna") && password.equals("ram@123")) {
			System.out.println("Welcome : " + name);
		} else {
			System.out.println("Username or Password Does not Match try Again..");

		}
	}
}
