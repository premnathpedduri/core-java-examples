package com.java.functionalinterface;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		Square s = new Square();
		int i = 5;
		System.out.println("Square of :" + i + " is : " + s.calculate(4));
	}
}
