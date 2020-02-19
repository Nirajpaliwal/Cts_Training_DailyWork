//program to find factorial of number

package com.cognizant.training;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int number = sc.nextInt();
		long factorial = 1;

		for (int i = 1; i <= number; i++) {

			factorial *= i;
		}
		System.out.printf("Factorial of %d = %d", number, factorial);

	}

}
