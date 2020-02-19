// program to swap two numbers

package com.cognizant.training;
import java.util.Scanner;

public class swapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int first_number = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int second_number = sc.nextInt();
		int temp;
		
		System.out.println("first number before swapping : " + first_number);
		System.out.println("second number before swapping : " + second_number);
		
		temp = first_number;
		first_number = second_number;
		second_number = temp;
		
		System.out.println("first number after swapping : " + first_number);
		System.out.println("second number after swapping : " + second_number);
	}

}
