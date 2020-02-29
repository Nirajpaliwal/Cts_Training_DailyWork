package com.cts.training.streamapi.day24;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		// System.out.println(names);

		// 1. print names with length more than 6
		List<String> namesWithSizeLessThan6 = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		System.out.println("****** Names with length greater than 6 ******");
		namesWithSizeLessThan6.forEach(System.out::println);

		// 2. Names in upper case
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("\n****** Names In Upper case ******");
		namesInUpper.forEach(System.out::println);

		long count = names.stream().count();
		System.out.println("\nCount of objects : " + count);

		Stream<Integer> data = Stream.of(1, 11, 111, 1111, 11111);
		System.out.println("\nData Count : " + data.count());

		Stream<String> language = Stream.of("c", "c++", "java", "python", "angular");

		List<String> languageList = language.filter(s -> s.length() > 4).collect(Collectors.toList());
		System.out.println("\n****** Languages with length more than 4 ******");
		languageList.forEach(System.out::println);

		Stream<String> language2 = Stream.of("c", "c++", "java", "python", "angular");

		List<String> languageListWithProgramming = language2.map(s -> s.concat(" language"))
				.collect(Collectors.toList());
		System.out.println("\n****** Languages with programming ******");
		languageListWithProgramming.forEach(System.out::println);

		List<String> defaultSorted = names.stream().sorted().collect(Collectors.toList());
		System.out.println("\n****** Default sorting ******");
		defaultSorted.forEach(System.out::println);

		List<String> customSorted = names.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("\n****** Custom sorting ******");
		customSorted.forEach(System.out::println);

	}

	private static void addNames(ArrayList<String> names) {
		names.add("Rahul kumar");
		names.add("Ayush");
		names.add("Karan sharma");
		names.add("Kamal");
		names.add("Rajat lad");
	}

}
