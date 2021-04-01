package com.promineo.oop;

public class Bird extends Animal implements IFlyable, IHoverable {
    public int NumberOfWings;

	public void Fly() {
		System.out.println("Bird's method of flying");
	}
}
