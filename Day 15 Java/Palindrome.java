// Program to Check Whether a Number is Palindrome or Not

package com.cognizant.training;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int remainder, orignal, reverse = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int number = sc.nextInt();

		orignal = number;

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}
		if (orignal == reverse)
			System.out.println(orignal + " is a palindrome.");
		else
			System.out.println(orignal + " is not a palindrome.");

	}

}
