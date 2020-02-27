// Write a program in C to find the second largest element in an array

package com.cts.training.day22;

import java.util.Scanner;

public class SecondLargestElementFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array = new int[no_of_elements];
		int first_max = array[0];
		int second_max = array[0];

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < no_of_elements; i++) {
			if (array[i] > first_max) {
				second_max = first_max;
				first_max = array[i];
			} else if (array[i] > second_max) {
				second_max = array[i];
			}

		}
		System.out.println("\nSecond Hoghest Element : " + second_max);

	}

}
