// program to print an integer entered by user

package com.cognizant.training;

import java.util.Scanner;

public class printInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");

		int number = sc.nextInt();

		System.out.println("Entered number is : " + number);

	}

}
