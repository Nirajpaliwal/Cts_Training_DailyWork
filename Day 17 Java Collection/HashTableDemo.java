package com.cognizant.training.day17;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> map = new Hashtable<>();
		map.put("Banana", 35);
		map.put("Orange", 60);
		map.put("Mango", 25);
		map.put("Grapes", 40);
		map.put("Water Melon", 67);

		map.put("Banana", 70);
		
		//map.put(null, 0);

		System.out.println(map);
		System.out.println("Banana price is : " + map.get("Banana"));
		System.out.println("apple is in list or not : " + map.containsKey("apple"));
		System.out.println("is 25 there ? : " + map.containsValue(25));
		System.out.println("Is HashMap empty ? : " + map.isEmpty());
		System.out.println(map.remove("Orange", 22));

		System.out.println(map);

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " -->" + " Value : " + entry.getValue());
		}

	}

}
