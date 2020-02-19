// program to add two integers

package com.cognizant.training;

import java.util.Scanner;

public class sumOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int first_number = sc.nextInt();

		System.out.println("Enter second number : ");
		int second_number = sc.nextInt();

		int sum_of_numbers = first_number + second_number;

		System.out.println("Sum of " + first_number + " & " + second_number + " is : " + sum_of_numbers);

	}
}
