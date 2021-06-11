package com.java.solidprinciples;

public class CarExample {

	public static void main(String[] args) {
		EngineCar motorCar=new MotorCar();
		motorCar.turnOnEngine();
		motorCar.accelerate();
		
		EngineLessCar elctricCar=new ElectricCar();
		//elctricCar.turnOnEngine();
		elctricCar.accelerate();
	}

}
