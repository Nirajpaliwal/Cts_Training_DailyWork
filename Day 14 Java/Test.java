package com.sample;

class Person {
	String person_name = "Rahul";

	void display_persons() {
		System.out.println("we are in person class & person name is : " + person_name);
	}
}

class Employee extends Person {
	void display_employee() {
		System.out.println("we are in employee class & employee name is :" + person_name);
	}
}

class Manager extends Employee {
	void display_manager() {
		System.out.println("we are in manager class and manager name is : " + person_name);
	}
}

class Hr extends Employee {
	void display_hr() {
		System.out.println("we are in HR class");
	}
}

class Developer extends Manager {
	void display_developer() {
		System.out.println("we are in Developer class");
	}
}

class Tester extends Manager {
	void display_tester() {
		System.out.println("we are in Tester class");
	}
}

public class Test {
	public static void main(String[] args) {

		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Hr h = new Hr();
		Developer d = new Developer();
		Tester t = new Tester();

		p.display_persons();
		e.display_employee();
		m.display_manager();
		h.display_hr();
		d.display_developer();
		t.display_tester();

	}
}
