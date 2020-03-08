package com.epam.creational;

//Abstract Factory Pattern

public abstract class Car {
	
	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}
	
	protected abstract void construct();
	
	private CarType model = null;
	private Location location = null;
	
	@Override
	public String toString() {
		return "Model - " + model + "built in " + location;
	}
}