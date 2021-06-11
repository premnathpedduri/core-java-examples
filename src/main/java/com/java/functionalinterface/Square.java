package com.java.functionalinterface;

public class Square implements SquareInterface {

	@Override
	public int calculate(int x) {
		return x * x;
	}

}
