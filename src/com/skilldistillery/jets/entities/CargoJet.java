package com.skilldistillery.jets.entities;

public class CargoJet extends JetImplement implements CarryCargo {
	int capacity;

	public CargoJet() {
	}

	public CargoJet(String model, int speed, int range, double price, int capacity) {
		super(model, speed, range, price);
		this.capacity = capacity;
	}

	@Override
	public void carryCargo(String destination, int cargo) {
		boolean dropChance = (Math.random() > 0.9);
		this.fly();
		System.out.println(this.model +  " leaves the airport carrying " + cargo + "lbs cargo." );
		if(dropChance) {
			int cargoDropped = (int)(Math.random()*0.4*cargo);
			System.out.println("Oh No! " + this.model + " has dropped " + cargoDropped +" lbs cargo...");
			System.out.println("I guess someone's not getting those shoes for their cat...");
			System.out.println(this.model +  " arrives at " + destination + " carrying " + (cargo - cargoDropped) + "lbs cargo." );
		}else {
			System.out.println(this.model +  " arrives at " + destination + " carrying " + cargo + "lbs cargo." );
		}
	}

	public int getCapacity() {
		return capacity;
	}
	
	@Override
	public void fly() {
		System.out.println("Nyeeerrooooooh");
		System.out.println(this.model + " begins flying ");
	}

	@Override
	public String toString() {
		return "Cargo Jet:  " + model +";	 weight capacity: " + capacity + "lbs, max speed " + speed + "mph, range:" + range
				+ "miles, price: $" + price + ".";
	}

}
