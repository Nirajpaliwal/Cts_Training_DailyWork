// demonstration of String class

package com.cognizant.training;

public class StringDemo {

	public static void main(String[] args) {
		String city1 = "pune";
		String city2 = "indore";
		String city3 = "pune";

		String msg = "I am an engineer";
		String year = "      of 2020          ";

		String city4 = new String("pune");
		String city5 = new String("indore");
		String city6 = new String("pune");

		System.out.println(city1 == city2);
		System.out.println(city1 == city3);

		System.out.println();
		
		// equals() method
		System.out.println(city4.equals(city6));
		System.out.println(city4.equals(city5));

		System.out.println();
		
		// concat() method
		String result = msg.concat(year);
		System.out.println(result);
		
		// substring() method
		System.out.println("Substring method  : " + msg.substring(3,10));
		
		// substring() method
		System.out.println("Substring method : " + msg.substring(5));
		
		// charAt() meghtod
		System.out.println("charAt method : " + msg.charAt(5));
		
		// compareTo() method
		System.out.println("compareTo method : " + msg.compareTo(year));
		
		//startsWith() method
		System.out.println("startsWith method : " + msg.startsWith("I am"));
		
		//endsWith() method
		System.out.println("endsWith method : " + msg.endsWith("2020"));
		
		//trim() method
		System.out.println("trim method : " + year.trim());
		
		// hashCode() method
		System.out.println("hashCode method : " + msg.hashCode());
		
		// indexOf() method
		System.out.println("indexOf method : " + msg.indexOf('e'));
		
		// lastIndexOf() method
		System.out.println("lastIndexOf method : " + msg.lastIndexOf('e'));
		
		// replace() method
		System.out.println("replace method : " + year.replace('o', 'O'));
		
		
		
		
		
	}

}
