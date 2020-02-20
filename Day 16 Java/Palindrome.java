package com.cognizant.training.day16;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string : ");
		String input = sc.nextLine();

		char[] array = input.toCharArray();
		String reverse = "";
		
		for (int i = array.length; i >0 ; i--) {
			reverse = reverse + array[i];
		}
		for (int c = 0; c < array.length; c++)
			System.out.print(array[c]);
		System.out.println(reverse);
	}

}
