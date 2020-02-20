// // Assignment 1 solution

package com.cognizant.training.day16;

import java.util.Scanner;

public class StringTask2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input string : ");
		String input = sc.nextLine();
		String[] words = input.split("\\s+");

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

}
