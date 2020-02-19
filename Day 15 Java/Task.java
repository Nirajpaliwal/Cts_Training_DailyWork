// program which accepts two integers as a 
// minimum and maximum limit and calculates 
// total of how many 1s were their within the limit.

package com.cognizant.training;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lower_limit = sc.nextInt();
		int max_limit = sc.nextInt();
		int count = 0;
		for(int i = lower_limit; i<= max_limit; i++)
		{
			int number = i;
			while(number != 0)
			{
				int digit = number % 10;
				if (digit == 1)
				{
					count++;
				}
				number = number / 10;
			}
		}
		System.out.println(count);
	}

}