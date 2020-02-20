package com.cognizant.training.collection.day16;


import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	public boolean updateName(String old_name, String new_name) {
		return true;
	}
	
	public boolean deleteName(String new_name) {
		return true;
	}
	
	public String getName(int index) {
		return name.get(index);
	}
	
	public ArrayList<String> getAllName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		NameList list = new NameList();
		
		ArrayList<String> names = list.getAllName();
		
		
		//System.out.println(names);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Press 1 to add new name ");
		System.out.println("Press 2 to delete name ");
		System.out.println("Press 3 to update name ");
		System.out.println("Press 4 to get specific name ");
		System.out.println("Press 5 to get all name ");
		System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter new name : ");
			String new_name_to_add = sc.nextLine();
			list.addName(new_name_to_add);	
			break;
		case 2:
			System.out.println("Enter name to delete : ");
			String name_to_delete = sc.nextLine();
			list.deleteName(name_to_delete);
			break;
		case 3:
			System.out.println("Enter old name : ");
			String old_name = sc.nextLine();
			
			System.out.println("Enter new name to update : ");
			String new_name = sc.nextLine();
			
			list.updateName(old_name,new_name);
			break;
		case 4:
			System.out.println("Enter index to get name : ");
			int index = sc.nextInt();
			System.out.println(list.getName(index));
			break;
		case 5:
			System.out.println(list.getAllName());
			break;
			
			
		}
		
		
		
	}
}
