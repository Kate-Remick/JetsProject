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
	public void carryPassengers() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Passenger Jet: " + model + ";	Number of Seats: " + passengerCapacity +  ", max speed " + speed
				+ "mph, range =" + range + "miles, price: $" + price + ".";
	}

}
