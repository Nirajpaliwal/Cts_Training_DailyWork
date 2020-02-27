package com.cts.training.day22;

import java.util.Scanner;

public class ArrayTaskMultipleConditions {

	public static void sumOfRows(int[][] array, int rows, int columns) {

		for (int i = 0; i < rows; i++) {
			int sum_of_rows = 0;
			for (int j = 0; j < columns; j++) {
				sum_of_rows = sum_of_rows + array[i][j];

			}
			System.out.println("\nSum of row " + i + " is : " + sum_of_rows);
		}

	}

	public static void sumOfColumns(int[][] array, int rows, int columns) {

		for (int i = 0; i < rows; i++) {
			int sum_of_columns = 0;
			for (int j = 0; j < columns; j++) {
				sum_of_columns = sum_of_columns + array[j][i];

			}
			System.out.println("\nSum of column " + i + " is : " + sum_of_columns);
		}

	}

	public static void sumOfDigonals(int[][] array, int rows, int columns) {
		int sum_of_digonals = 0;
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				if (i == j)
					sum_of_digonals = sum_of_digonals + array[i][j];

			}

		}
		System.out.println("\nSum of digonals is : " + sum_of_digonals);
	}

	public static void sumOfElementsWithCondition(int[][] array, int rows, int columns) {
		int sum = 0;
		int result = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (array[i][j] % 2 == 0 && array[i][j] % 3 == 0) {
					result = result + array[i][j];

				}

			}

		}
		System.out.println("\nSum array with divisible by 2 & 3 condition is : " + result);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput the number of rows to store in the array : ");
		int no_of_rows = sc.nextInt();

		System.out.println("\nInput the number of columns to store in the array : ");
		int no_of_columns = sc.nextInt();
		int[][] array = new int[no_of_rows][no_of_columns];

		for (int i = 0; i < no_of_rows; i++) {
			for (int j = 0; j < no_of_columns; j++) {
				System.out.println("Element " + j + " of row " + i + " : ");
				array[i][j] = sc.nextInt();
			}
		}

		sumOfRows(array, no_of_rows, no_of_columns);
		System.out.println("--------------------------");
		sumOfColumns(array, no_of_rows, no_of_columns);
		System.out.println("--------------------------");
		sumOfDigonals(array, no_of_rows, no_of_columns);
		System.out.println("--------------------------");
		sumOfElementsWithCondition(array, no_of_rows, no_of_columns);


	}

}
