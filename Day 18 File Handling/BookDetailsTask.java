package com.cognizant.training.filehandling.day18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookDetailsTask {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		char c;
		String book_name;
		String author_name;
		String price;
		do {
			System.out.println("\n");
			System.out.println("-------- Book Management Menu -------------");
			System.out.println("1. Add Book Details : ");
			System.out.println("2. Display Book Details : ");
			System.out.println("3. Exit");

			System.out.println("\nEnter your choice : ");
			choice = Integer.parseInt(sc.next());
			switch (choice) {
			case 1:
				System.out.println("\nEnter book name : ");
				book_name = br.readLine();

				System.out.println("\nEnter author name : ");
				author_name = br.readLine();

				System.out.println("\nEnter price : ");
				price = br.readLine();

				writeDataToFile(book_name, author_name, price);
				break;
			case 2:
				System.out.println();
				getDataFromFile();
				break;
			case 3:
				System.exit(0);
			}
			System.out.println("\n\n\nDo you want to contunue ? y/n : ");
			c = sc.next().charAt(0);
		} while (c != 'n');

	}

	public static void writeDataToFile(String book_name, String author_name, String price) throws IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\book_details5.txt";

		FileWriter fw = new FileWriter(path, true);

		fw.write(book_name + "\t" + author_name + "\t" + price);
		fw.append("\n");
		fw.close();
		System.out.println("Data saved into file succesfully");
	}

	public static void getDataFromFile() throws IOException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\Test\\src\\com\\cognizant\\training\\filehandling\\day18\\book_details5.txt";
		File file = new File(path);

		FileInputStream input = new FileInputStream(file);

		int i;
		while ((i = input.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
