// program to print inverted half pyramid using numbers

package com.cognnizant.training.day16;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int rows = sc.nextInt();

		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
