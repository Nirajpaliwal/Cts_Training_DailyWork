// program to check alphabet is vowel or consonant

package com.cognizant.training;

import java.util.Scanner;

public class isVowelOrConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any single character : ");

		char character = sc.next().charAt(0);

		if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'
				|| character == 'a' || character == 'e' || character == 'o' || character == 'u') {
			System.out.println(character + " is vowel");
		} else {
			System.out.println(character + " is consonent");
		}
	}

}
