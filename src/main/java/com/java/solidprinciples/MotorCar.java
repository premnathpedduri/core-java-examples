package com.java.solidprinciples;

public class MotorCar implements EngineCar {
	

	 public MotorCar() {
		super();
		this.engine = new Engine();
		System.out.println("Building Motor Car");
	}

	private Engine engine;

	    //Constructors, getters + setters

	    @Override
		public void turnOnEngine() {
	        //turn on the engine!
	        engine.on();
	    }

	    @Override
		public void accelerate() {
	        //move forward!
	        engine.powerOn(1000);
	    }
}
