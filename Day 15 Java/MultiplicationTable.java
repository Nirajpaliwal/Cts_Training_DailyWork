// Program to Generate Multiplication Table

package com.cognizant.training;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int number = sc.nextInt();

		for (int i = 1; i <= 10; ++i) {
			System.out.printf("%d * %d = %d \n", number, i, number * i);
		}
	}

}
