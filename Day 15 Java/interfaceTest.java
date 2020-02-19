package com.cognizant.training;

interface Add {
	int add(int a, int b);
	
	default int multiply(int a, int b) {
		return a * b;
	}
	
	static int modules(int x, int y) {
		return x % y;
	}
}

interface Sub extends Add {
	int add(int a, int b);
}

class Div{
	public int div(int a, int b) {
		return a/b;
	}
}

class Impl extends Div implements Sub {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	
	public int sub(int a, int b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}
}



public class interfaceTest {

	public static void main(String[] args) {
		Impl imp = new Impl();
		
		Add a = new Impl();

		System.out.println(imp.add(5, 3));
		System.out.println(imp.sub(1, 3));
		System.out.println(imp.div(6, 3));
		
		System.out.println(imp.multiply(6, 3));
//		System.out.println(a.modules(6, 3));

	}

}
