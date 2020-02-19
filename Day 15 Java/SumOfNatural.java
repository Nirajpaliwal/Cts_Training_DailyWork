// Program to Calculate the Sum of Natural Numbers
package com.cognizant.training;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int number = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= number; ++i) {
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}
}
