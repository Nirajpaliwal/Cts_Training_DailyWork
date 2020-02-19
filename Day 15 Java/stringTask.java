//  Write statements in Java to implement the following

package com.cognizant.training;
import java.util.regex.Pattern;

public class stringTask {

	public static boolean isTitleCase(String str)
	{
		int i;
		boolean result = true;
		String []word = str.split("\\s+");
		for(i = 0; i < word.length; i++)
		{
			if(word[i].charAt(0) >= 65 && word[i].charAt(0) <= 90 )
			{
				result = true;
			}
			else
			{
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "Global Warming";
		
		int len = str.length();
		int i;
		
		// last four characters
		System.out.println(str.substring(len-4));
		
		
		// substring starting from index 4 and ending at index 8
		System.out.println(str.substring(4,9));
		
		
		//string has alphanumeric characters or not
		if(Pattern.matches("[a-zA-Z0-9]+", str))
		{
			System.out.println("String has alphanumeric character");
		}
		else
		{
			System.out.println("String has not alphanumeric character");
		}
		
		
		// trim the last four characters from the string
		System.out.println(str.substring(0,len-4));
		
		// trim the first four characters from the string
		System.out.println(str.substring(4,len));
		
		// display the starting index for the substring "Wa"
		System.out.println(str.indexOf("Wa"));
		
		// change the case of the given string
		System.out.println(str.toLowerCase());
		
		// change the case of the given string
		System.out.println(str.toUpperCase());
		
		// check if the string is in title case
		
		System.out.println(isTitleCase(str));
		
		// replace all the occurrences of letter "a" in the string with "*"
		System.out.println(str.replace('a', '*'));

	}
	

}
