// program to read data from two files

package com.cognizant.training.filehandling.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadDataFromTwoFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path1 = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample3.txt";
		String path2 = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\ReadDataFromMultipleFiles.java";
		// String path3 =
		// "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample5.txt";

		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);

		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);

		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
