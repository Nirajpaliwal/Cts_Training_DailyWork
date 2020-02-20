package com.cognizant.training.collection.day16;


import java.awt.List;
import java.util.ArrayList;

public class NameList {
	static ArrayList<String> name;
	
	static {
		name = new ArrayList<>();
		name.add("Naveen");
		name.add("Raj");	
	}
	
	public boolean addName(String new_name) {
		return true;
	}
	
	public boolean updateName(String new_name) {
		return true;
	}
	
	public boolean deleteName(String new_name) {
		return true;
	}
	
	public boolean getName() {
		return true;
	}
	
	public ArrayList<String> getAllName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		NameList list = new NameList();
		
		ArrayList<String> names = list.getAllName();
		System.out.println(names);
		
		System.out.println("Press 1 to add new name ");
		System.out.println("Press 2 to delete name ");
		System.out.println("Press 3 to update name ");
		System.out.println("Press 4 to get specific name ");
		System.out.println("Press 5 to get all name ");
		
		
	}
}
