package com.basic;

public class Bill {
	public static int a = 500;

	public static void main(String[] args) {
		Bill b1 = new Bill();
		b1.sum();
		b1.mul();
		b1.div();
		b1.sub();
	}

	public void sum() {
		int b = 90;
		System.out.println(a + b);

	}

	public void mul() {
		int b = 90;
		System.out.println(a * b);
	}

	public void div() {
		int b = 90;
		System.out.println(a / b);
	}

	public void sub() {
		int b = 90;
		System.out.println(a - b);
	}
}