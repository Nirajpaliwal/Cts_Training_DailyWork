// Write a program in C to sort elements of array in ascending order

package com.cts.training.day22;

import java.util.Scanner;

public class AscendingSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array = new int[no_of_elements];
		int temp;

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < no_of_elements; i++) {
			for (int j = 0; j < no_of_elements; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}

		System.out.println("\nElements of array in sorted ascending order : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.print(array[i] + "  ");
		}
	}

}
