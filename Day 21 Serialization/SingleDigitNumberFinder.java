package com.cts.training.day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleDigitNumberFinder {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter nay number: ");
		String number = br.readLine();

		int sum = 0;
		int count = 0;

		while (number.length() > 1) {
			sum = 0;

			for (int i = 0; i < number.length(); i++) {
				sum = sum + (number.charAt(i) - '0');
			}

			number = sum + "";
			count++;
		}

		System.out.println(count);
	}
}
