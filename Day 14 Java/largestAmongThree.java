// Program to find largest among three numbers

package com.cognizant.training;

import java.util.Scanner;

public class largestAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		float first_number = sc.nextFloat();

		System.out.println("Enter second number : ");
		float second_number = sc.nextFloat();

		System.out.println("Enter third number : ");
		float third_number = sc.nextFloat();

		if (first_number >= second_number && first_number >= third_number) {
			System.out.println("Largest number in " + first_number + "," + second_number + "," + third_number + " is : "
					+ first_number);
		} else if (second_number >= first_number && second_number >= third_number) {
			System.out.println("Largest number in " + first_number + "," + second_number + "," + third_number + " is : "
					+ second_number);
		} else {
			System.out.println("Largest number in " + first_number + "," + second_number + "," + third_number + " is : "
					+ third_number);
		}
	}

}
