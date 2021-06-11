package com.java.solidprinciples;

public class Duck extends Bird {

	

	@Override
	public void chirp() {
		System.out.println("Ki Ki Ki");
	}

	@Override
	public void peck() {
		System.out.println("Quack Quack");
	}

}
