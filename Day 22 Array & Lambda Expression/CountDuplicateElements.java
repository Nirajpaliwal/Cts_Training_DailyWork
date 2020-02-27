// Write a program in C to count a total number of duplicate elements in an array.

package com.cts.training.day22;

import java.util.Scanner;

public class CountDuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array = new int[no_of_elements];
		int duplicate_elements = 0;

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < no_of_elements; i++) {
			for (int j = i + 1; j < no_of_elements; j++) {
				if (array[i] == array[j]) {
					duplicate_elements++;
				}
			}
		}
		System.out.println("Total number of duplicate elements found in the array is : " + duplicate_elements);

	}

}
