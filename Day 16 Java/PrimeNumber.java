// Program to Check Whether a Number is Prime or Not

package com.cognnizant.training.day16;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int number = sc.nextInt();

		boolean isprime = false;
		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				isprime = true;
				break;
			}
		}

		if (!isprime)
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");

	}

}
