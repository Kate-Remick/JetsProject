package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private int speed;
	private int range;
	private double price;
	
	public Jet() {}
	
	
	public double getPrice() {
		return price;
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
