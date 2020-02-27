package com.cts.training.day22;

class Test<T> {
	private T obj;

	public T get() {
		return obj;
	}

	public void set(T ob) {
		this.obj = ob;
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		Test<Integer> t = new Test<Integer>();
		Test<String> t2 = new Test<String>();

		t.set(5);

		int i = (int) t.get();
		System.out.println(i);

		t2.set("Hello");
		String s = (String) t2.get();
		System.out.println(s);
	}

}
