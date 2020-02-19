// program to check if a Number is Positive or Negative

package com.cognizant.training;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		float number = sc.nextFloat();

		if (number < 0.0)
			System.out.println(number + " is a negative number");
		else if (number > 0.0)
			System.out.println(number + " is a positive number");
		else
			System.out.println(number + " is 0");

	}

}
