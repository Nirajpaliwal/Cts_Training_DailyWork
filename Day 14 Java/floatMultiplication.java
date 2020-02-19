// Program to multiply two floating point number

package com.cognizant.training;

import java.util.Scanner;

public class floatMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		float first_number = sc.nextFloat();

		System.out.println("Enter second number : ");
		float second_number = sc.nextFloat();

		float multiplication_of_numbers = first_number * second_number;
		System.out.println("Multiplication of " + first_number + " & " + second_number + " is : " + multiplication_of_numbers);

	}

}
