// demonstration of string buffer class

package com.cognizant.training;

public class bufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		System.out.println(sb.capacity());
		
		sb.append("Hello to java training");
		System.out.println(sb.capacity());
		
		sb.append(" ...This is buffer string demo");
		System.out.println(sb.capacity());
		
		sb.insert(6, "dear ");
		System.out.println(sb);
		
		sb.replace(6, 10, "DEAR");
		System.out.println(sb);
		
		sb.delete(6, 10);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
