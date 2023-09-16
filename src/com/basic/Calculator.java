package com.basic;

public class Calculator {
	public static int a = 100;

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.sum();
		c1.div();
		c1.mul();
		c1.sub();

	}

	public void sum() {
		int b = 20;
		System.out.println(a + b);
	}

	public void div() {
		int b = 20;
		System.out.println(a / b);
	}

	public void mul() {
		int b = 20;
		System.out.println(a * b);
	}

	public void sub() {
		int b = 20;
		System.out.println(a - b);

	}
}
