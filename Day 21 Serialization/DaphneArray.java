package com.cts.training.day21;

import java.awt.Event;

public class DaphneArray {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 };
		int start_count = 0;
		int end_count = 0;
		int odd_count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd_count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				start_count++;
			} else {
				break;
			}
		}

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] % 2 == 0) {
				end_count++;
			} else {
				break;
			}
		}

		if (start_count == end_count && odd_count > 1) {
			System.out.println("it is Daphne array");
		} else {
			System.out.println("it is not Daphne array");
		}
		
		System.out.println(start_count);
		System.out.println(end_count);
		System.out.println(odd_count);
	}

}
