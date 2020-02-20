// program which takes input as a string and 
// sort all the alphabets in string

package com.cognizant.training.day16;

import java.util.Scanner;

public class StringSort {
	public static void sort(String str) {
		String new_str = str.toLowerCase();
		char temp;
		char[] array = new_str.toCharArray();
		int len = array.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array);
	}
	
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String input = sc.nextLine();
		
		// calling the sort function
		sort(input);
	}
}
