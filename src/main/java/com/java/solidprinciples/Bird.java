package com.java.solidprinciples;

public class Bird implements Animal {

	@Override
	public void breathe() {
		System.out.println("Breathing...");
	}

	@Override
	public void sleep() {
		System.out.println("Gurrr Gurrr!");

	}

	@Override
	public void eat() {
		System.out.println("Bird is eating!");

	}

	public void chirp() {
		System.out.println("♫ ♫ ♫");
	}

	public void peck() {
		System.out.println("Peck, peck!");
	}

}
