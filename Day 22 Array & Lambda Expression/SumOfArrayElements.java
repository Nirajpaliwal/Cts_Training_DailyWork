// Write a program in C to find the sum of all elements of the array

package com.cts.training.day22;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array = new int[no_of_elements];
		int sum = 0;

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array[i] = sc.nextInt();
			sum += array[i];
		}

		System.out.println("Sum of all elements stored in the array is : " + sum);
	}

}
