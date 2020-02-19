// program to find ascii value of character

package com.cognizant.training;

import java.util.Scanner;

public class asciiValueOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any single character : ");

		char character = sc.next().charAt(0);

		int ascii_value_of_char = (int) character;

		System.out.println("Ascii value of " + character + " is : " + ascii_value_of_char);

	}

}
