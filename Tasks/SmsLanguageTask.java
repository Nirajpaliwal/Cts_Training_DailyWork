// SMS Language Task
// Sample Input : where were your? yesterday? why is today a working day for you ? 

package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class SmsLanguageTask {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text : ");
		String input = br.readLine();
		String[] words = null;

		words = input.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (Pattern.matches("\\w*\\W*", words[i]))
				words[i] = words[i].replaceAll("[y][e][s]", "s");

			if (Pattern.matches("\\w*\\W*", words[i]))
				words[i] = words[i].replaceAll("[y][o][u]", "u");

			if (Pattern.matches("\\w*\\W*", words[i]))
				words[i] = words[i].replaceAll("[t][o][d][a][y]", "2day");

			if (Pattern.matches("\\w*\\W*", words[i]))
				words[i] = words[i].replaceAll("[w][h][y]", "y");

		}

		System.out.println();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i]);
			sb.append(" ");
		}
		String str = sb.toString();
		System.out.println(str);

		// System.out.println(Arrays.toString(words));
	}

}
