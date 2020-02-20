// program to Toggle each alphabet case

package com.cognizant.training.day16;

import java.util.Scanner;

public class StringTask3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string : ");
		String input = sc.nextLine();

		char[] array = input.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 'A' && array[i] <= 'Z') {
				array[i] = (char) ((int) array[i] + 32);
			} else if (array[i] >= 'a' && array[i] <= 'z') {
				array[i] = (char) ((int) array[i] - 32);
			}

		}
		for (int c = 0; c < array.length; c++)
			System.out.print(array[c]);
	}
}
