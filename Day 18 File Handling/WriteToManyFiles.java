// program to write same data into multiple file

package com.cognizant.training.filehandling.day18;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToManyFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample3.txt";
		String path2 = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample4.txt";
		String path3 = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\sample5.txt";

		FileOutputStream out3 = new FileOutputStream(path);
		FileOutputStream out1 = new FileOutputStream(path2);
		FileOutputStream out2 = new FileOutputStream(path3);

		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		String data = "This is common data";

		byte[] b = data.getBytes();

		bout.write(b);

		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);

		System.out.println("Done");

	}

}
