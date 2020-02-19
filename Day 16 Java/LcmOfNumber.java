// Program to Find LCM of two Numbers

package com.cognnizant.training.day16;

import java.util.Scanner;

public class LcmOfNumber {

	public static void main(String[] args) {
		int max, lcm = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int first_number = sc.nextInt();

		System.out.println("Enter second number : ");
		int second_number = sc.nextInt();

		if (first_number > second_number) {
			max = first_number;
		} else {
			max = second_number;
		}
		for (int i = 0; i < max; i++) {
			if (max % first_number == 0 && max % second_number == 0) {
				lcm = max;
				break;
			}
			max++;
			//System.out.println(max);
		}
		System.out.println("LCM of the two numbers = " + lcm);
	}
}
