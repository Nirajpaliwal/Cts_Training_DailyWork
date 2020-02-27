// Write a program in C to find the maximum and minimum element in an array

package com.cts.training.day22;

import java.util.Scanner;

public class MaxMinElementFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array = new int[no_of_elements];
		int maximum_element = array[0];
		int minimum_element = array[0];

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < no_of_elements; i++) {
		
			if (array[i] < minimum_element) {
				minimum_element = array[i];
			}
			if (array[i] > maximum_element) {
				maximum_element = array[i];
			}


		}

		System.out.println("Maximum element is : " + maximum_element);

		System.out.println("Minimum element is : " + minimum_element);

	}
}
