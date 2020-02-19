// Program to Count Number of Digits in an Integer

package com.cognizant.training;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int number = sc.nextInt();

		int count = 0;

		while (number != 0) {
			number /= 10;
			++count;
		}

		System.out.println("Number of digits: " + count);

	}

}
