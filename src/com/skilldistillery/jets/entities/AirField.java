package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet;

	public AirField(String file) {
		fleet = new ArrayList<Jet>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				String[] jetData = line.split(",");
				switch (jetData[0]) {
				case "FighterJet":
					fleet.add(new FighterJet(jetData[1], Integer.parseInt(jetData[2]), Integer.parseInt(jetData[3]),
							Double.parseDouble(jetData[4]), Integer.parseInt(jetData[5])));
					break;
				case "PassengerJet":
					fleet.add(new PassengerJet(jetData[1], Integer.parseInt(jetData[2]), Integer.parseInt(jetData[3]),
							Double.parseDouble(jetData[4]), Integer.parseInt(jetData[5])));
					break;
				case "CargoJet":
					fleet.add(new CargoJet(jetData[1], Integer.parseInt(jetData[2]), Integer.parseInt(jetData[3]),
							Double.parseDouble(jetData[4]), Integer.parseInt(jetData[5])));
					break;
				default:
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void addJet() {
		this.fleet.add(null);

	}

	public void flyAllJets() {
		for (int i = 0; i < fleet.size(); i++) {
			this.fleet.get(i).fly();
		}
	}
	@Override
	public String toString() {
		return "AirField [fleet=" + fleet + "]";
	}
	public void fastestJet() {
		int fastestSpeed = 0;
		int fastestIndex = 0;
		for(int i  =0; i< fleet.size(); i++) {
			if(this.fleet.get(i).getSpeed() > fastestSpeed) {
				fastestSpeed = this.fleet.get(i).getSpeed();
				fastestIndex = i;
			}
			
		}
		System.out.println("The fastest jet in the fleet is a " + this.fleet.get(fastestIndex).getModel() + ", with a top speed of " + fleet.get(fastestIndex).getSpeed() + "mph");
	}
	public void longestRange() {
		int longestRange = 0;
		int longestIdx = 0;
		for(int i  =0; i< fleet.size(); i++) {
			if(this.fleet.get(i).getSpeed() > longestRange) {
				longestRange = this.fleet.get(i).getSpeed();
				longestIdx = i;
			}
			
		}
		System.out.println("The jet with the longest range in the fleet is " + this.fleet.get(longestIdx).getModel() + ", with a max range of " + fleet.get(longestRange).getRange() + " miles");
	}
	public void loadCargo() {
		System.out.println("Loading all cargo jets in the fleet...");
		for( int i =0; i < fleet.size(); i ++) {
			if(fleet.get(i) instanceof CargoJet) {
				System.out.println(fleet.get(i).getModel() + " is loaded up with " +((CargoJet) this.fleet.get(i)).getCapacity() + "lbs of cargo, and ready to fly!");
			}
		}
		System.out.println("All cargo jets are fully loaded.");
	}
	public ArrayList<FighterJet> dogFightMenu() {
		System.out.println("The following jets are combat ready: ");
		ArrayList<FighterJet> combatReady = new ArrayList<>();
		int jetNum = 1;
		for(Jet jet: this.fleet) {
			if(jet instanceof FighterJet) {
				System.out.println(jet.getModel() + ". Select " + jetNum + " to dogfight with this jet." );
				combatReady.add((FighterJet) jet);
			}
		}
		return combatReady;
	}
}
