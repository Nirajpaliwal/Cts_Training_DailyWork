// program to count strings having prefix "10" but "10" not included in count

package com.cognizant.training.filehandling.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPrefixTask {

	public static void main(String[] args) throws IOException {
		String[] input={"100","111","10100","10","10","100","1111"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter prefix : ");
		String input2 = br.readLine();
		int count = 0;
		for(int i = 0; i < input.length; i++)
		{
			if(input[i].startsWith("10") && input[i].length() > 2) {
				count++;			
			}
		}
		
		System.out.println("count is: " + count);	
	}
}
