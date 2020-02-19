package com.cognizant.training;

import java.util.Scanner;

public class quotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		
		int quotient = dividend / divisor;
		
		int remainder = dividend % divisor;
		
		System.out.println("Quotient is :" + quotient);
		System.out.println("Remainder is :" + remainder);

	}
}
