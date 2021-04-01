package com.promineo.oop;

public abstract class Car {
     public int NumberOfTires;
     
     public Car(int tires)
     {
    	 NumberOfTires = tires;
     }
     
     public abstract void Accelerate();
     
     public abstract void TurnLeft();
}
