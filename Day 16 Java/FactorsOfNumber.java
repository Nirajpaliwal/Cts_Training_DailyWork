// Program to Display Factors of a Number

package com.cognnizant.training.day16;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int number = sc.nextInt();

		System.out.print("Factors of " + number + " are: ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
