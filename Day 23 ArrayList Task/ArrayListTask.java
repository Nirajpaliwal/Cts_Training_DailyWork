// program to find element which are divisible by 2 & 3 and double the elements

package com.cts.training.day23;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(40);
		list.add(35);
		list.add(80);
		list.add(62);

		System.out.println(list);

		Iterator<Integer> it = list.iterator();
		Iterator<Integer> it2 = list.iterator();

		System.out.println("\nElements divisible by 2 & 5 are : ");
		while (it.hasNext()) {
			Integer element = it.next();
			if (element % 2 == 0 && element % 5 == 0) {
				System.out.print(element + "   ");
			}
		}

		System.out.println("\n\nDouble of elements are : ");
		while (it2.hasNext()) {
			Integer element = it2.next();
			element = element * 2;
			System.out.print(element + "   ");

		}
	}

}
