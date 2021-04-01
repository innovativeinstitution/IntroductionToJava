package com.promineo.oop;

public class Honda extends Car {

	public Honda(int tires) {
		super(tires);
	}

	@Override
	public void Accelerate() {
		System.out.println("Hondas is accelerating");
	}

	@Override
	public void TurnLeft() {
		System.out.println("Honda is turned left...");
	}

}
