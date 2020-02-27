// Write a program in C to copy the elements of one array into another array

package com.cts.training.day22;

import java.util.Scanner;

public class CopyOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array1 = new int[no_of_elements];
		int[] array2 = new int[no_of_elements];
		int sum = 0;

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array1[i] = sc.nextInt();
			array2[i] = array1[i];
		}

		System.out.println("\nThe elements stored in the first array are : ");

		for (int i = 0; i < no_of_elements; i++) {
			System.out.print(array1[i]);
		}

		System.out.println("\nThe elements stored in the second array are : ");

		for (int i = 0; i < no_of_elements; i++) {
			System.out.print(array2[i]);
		}

	}

}
