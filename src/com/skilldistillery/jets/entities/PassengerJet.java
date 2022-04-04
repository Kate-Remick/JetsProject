package com.skilldistillery.jets.entities;

public class PassengerJet extends JetImplement implements CarryPassengers {
	int passengerCapacity;

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public PassengerJet() {
	}

	public PassengerJet(String model, int speed, int range, double price, int passengerCapacity) {
		super(model, speed, range, price);
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public void carryPassengers(int numPassengers, String destination) {
		System.out.println();
		this.fly();
		System.out.println(this.model + " leaves the airport carrying " + numPassengers + "people.");
		System.out.println(this.model + " arrives at " + destination + " safely.");
		System.out.println("The everyone clapped.");
	}

	@Override
	public String toString() {
		return "Passenger Jet: " + model + ";	Number of Seats: " + passengerCapacity + ", max speed " + speed
				+ "mph, range =" + range + "miles, price: $" + price + ".";
	}
	public void fly() {
		System.out.println("Birrrroooooomm");
		System.out.println("The " + this.model + "flies");
	}

}
