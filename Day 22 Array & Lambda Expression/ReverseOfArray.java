// Write a program in C to read n number of values in an array and display it in reverse order

package com.cts.training.day22;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of elements to store in the array : ");
		int no_of_elements = sc.nextInt();
		int[] array = new int[no_of_elements];

		System.out.println("\nInput " + no_of_elements + " number of elements in the array : ");
		for (int i = 0; i < no_of_elements; i++) {
			System.out.println("Element " + i + " : ");
			array[i] = sc.nextInt();
		}

		System.out.println("\nThe values store into the array are : ");

		for (int i = 0; i < no_of_elements; i++) {
			System.out.print(array[i]);
		}

		System.out.println("\nThe values store into the array in reverse are :  ");

		for (int i = no_of_elements - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}

}
