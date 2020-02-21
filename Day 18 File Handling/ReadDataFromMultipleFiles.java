// Progtam to read data from multiple files

package com.cognizant.training.filehandling.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadDataFromMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path1 = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\ReadDataFromTwoFiles.java";
		String path2 = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample5.txt";
		String path3 = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\ReadDataFromMultipleFiles.java";

		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		FileInputStream fin3 = new FileInputStream(path3);

		Vector vector = new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);

		Enumeration en = vector.elements();
		SequenceInputStream sis = new SequenceInputStream(en);

		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
