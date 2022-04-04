package com.skilldistillery.jets.entities;

public class JetImplement extends Jet{

	public JetImplement() {}
	
	public JetImplement(String model, int speed, int range, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	
	}
	public void fly() {
		System.out.println("Woosh! the Jet Flies!");
		System.out.println(this.model + " can continue flying for " + (this.getRange()/this.getSpeed()) + " minutes.");
	}

	@Override
	public String toString() {
		return "JetImplement [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	

}
