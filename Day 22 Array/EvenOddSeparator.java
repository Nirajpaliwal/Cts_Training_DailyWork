// Write a program in C to separate odd and even integers in separate arrays

package com.cts.training.day22;

import java.util.Scanner;

public class EvenOddSeparator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array = new int[no_of_elements];
		int even_count = 0;
		int odd_count = 0;

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < no_of_elements; i++) {
			if (array[i] % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
		}

		int[] even_array = new int[even_count];
		int[] odd_array = new int[odd_count];

		int j = 0;
		int k = 0;
		for (int i = 0; i < no_of_elements; i++) {
			if (array[i] % 2 == 0) {
				even_array[j] = array[i];
				j++;
			} else {
				odd_array[k] = array[i];
				k++;
			}
		}

		System.out.println("\nThe Even elements are : ");
		for (int i = 0; i < even_array.length; i++) {
			System.out.print(even_array[i] + "  ");
		}

		System.out.println("\nThe Odd elements are : ");
		for (int i = 0; i < odd_array.length; i++) {
			System.out.print(odd_array[i] + "  ");
		}

	}

}
