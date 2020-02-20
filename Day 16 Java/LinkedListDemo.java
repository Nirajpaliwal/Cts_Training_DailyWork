package com.cognizant.training.collection.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList();
		list.add("Hello");
		list.add("To");
		list.add("java");
		list.add("batch");
		list.add("5");

		System.out.println(list);

		list.remove(2);
		list.add(2, "Advance Java");

		System.out.println("List contains python ? : " + list.contains("Python"));
		System.out.println("List Size : " + list.size());

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("-------Iterator--------");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}

		System.out.println("-----List Iterator forward direction----------");

		ListIterator<String> it2 = list.listIterator();

		while (it2.hasNext()) {
			String element2 = it2.next();
			System.out.println(element2);
		}

		System.out.println("-----List Iterator backward direction----------");

		while (it2.hasPrevious()) {
			String element2 = it2.previous();
			System.out.println(element2);
		}

	}

}
