// BufferReader Example

package com.cognizant.training.filehandling.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestBufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer : ");
		int number = Integer.parseInt(br.readLine());

		System.out.println("Enter string : ");
		String str1 = br.readLine();

		System.out.println("Enter string : ");
		String str2 = br.readLine();

		System.out.println("Enter string : ");
		String str3 = br.readLine();

		System.out.println(number);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}
}
