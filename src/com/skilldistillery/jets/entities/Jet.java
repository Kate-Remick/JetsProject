package com.skilldistillery.jets.entities;

public abstract class Jet {
	protected String model;
	protected int speed;
	protected int range;
	protected double price;
	
	public Jet() {}
	
	
	public double getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Model: " + model + ".";
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getModel() {
		return model;
	}


	public int getSpeed() {
		return speed;
	}


	public int getRange() {
		return range;
	}


	public abstract void fly();
	
	
}
