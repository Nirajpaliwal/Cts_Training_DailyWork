package com.cognizant.training.filehandling.day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample2.txt";

		FileOutputStream out = new FileOutputStream(path, true);

		String message = ", one more time appended";
		byte[] b = message.getBytes();
		out.write(b);
		out.close();
		System.out.println("Data saved into file succesfully");
	}

}
