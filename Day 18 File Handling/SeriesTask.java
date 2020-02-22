// Generate a series of first 10 number as follows
// 36,34,30,28,24,22,18,16,12,10

package com.cognizant.training.filehandling.day18;

public class SeriesTask {

	public static void main(String[] args) {
		int num = 36;
		System.out.print(num);
		System.out.print(" ");
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				num = num - 2;
				System.out.print(num);
				System.out.print(" ");
			} else {
				num = num - 4;
				System.out.print(num);
				System.out.print(" ");
			}
		}

	}

}
