// program to find sum of digits of number
package com.sample;
import java.util.*;

public class sumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		//System.out.println(number);
		int sum_of_digits = 0;
		
		while(number != 0)
		{
			sum_of_digits = sum_of_digits + number % 10;
			number = number / 10;
		}
		
		System.out.println("Sum of digits is : "+ sum_of_digits);
	}

}
