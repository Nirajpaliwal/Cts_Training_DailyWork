package com.cts.training.day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void serialize(Employee employee, String path) throws FileNotFoundException {
		try {
			FileOutputStream fout = new FileOutputStream(path);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream oos;
			oos = new ObjectOutputStream(bout);
			oos.writeObject(employee);

			oos.close();
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Object deserialization(String filepath) {
		try {
			FileInputStream fin = new FileInputStream(filepath);
			BufferedInputStream bin = new BufferedInputStream(fin);
			ObjectInputStream oin = new ObjectInputStream(bin);
			Object obj = oin.readObject();
			oin.close();
			return obj;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
//		Employee employee = new Employee(101, "Ayush", "Indore", "Pat", 22, 1452, 8564);
//		try {
//		 serialize(employee,
//					"C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cts\\training\\day21\\employee.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Object Saved");
//	}

		String path = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cts\\training\\day21\\employee.txt";
		Employee employee = (Employee) deserialization(path);
		System.out.println(employee);
	}
}
