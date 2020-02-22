// Readin data from one file and writing into another file

package com.cognizant.training.filehandling.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample2.txt";
		String copy_path = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample2_copy.txt";
		File file = new File(path);

		System.out.println("File name : " + file.getName());
		System.out.println("File length is : " + file.length());
		System.out.println("Parent is : " + file.getParent());
		System.out.println("Parent is : " + file.getAbsolutePath());

		FileInputStream input = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(copy_path, true);

		int i;
		while ((i = input.read()) != -1) {

			System.out.print((char) i);
			out.write((char) i);

		}

//		int len = input.available();
//		byte [len] arr = ;

	}

	
	
}
