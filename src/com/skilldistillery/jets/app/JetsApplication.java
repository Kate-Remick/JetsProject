package com.skilldistillery.jets.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.FighterJet;

public class JetsApplication {
	Scanner kb;
	public JetsApplication() {
		this.kb = new Scanner(System.in);
	}

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		String jets = "Jets.txt";
		AirField field = new AirField(jets);
		app.run(app, field);
		app.kb.close();

	}

	private void displayMenu() {
		System.out.println("*--- Select an Option ---*");
		System.out.println("1) List all jets in the fleet");
		System.out.println("2) Fly all jets");
		System.out.println("3) View fastest jet");
		System.out.println("4) View jet with the longest range");
		System.out.println("5) Load all cargo jets");
		System.out.println("6) Transport cargo");
		System.out.println("7) Dogfight!");
		System.out.println("8) Add a jet to the fleet");
		System.out.println("9) Remove a jet from the fleet");
		System.out.println("10) Transport passengers");
		System.out.println("11) Quit");

	}

	public void run(JetsApplication app, AirField field) {
		System.out.println("Welcome to the Jets Application.");
		try {
			int userInput = 0;
			while (userInput != 11) {
				app.displayMenu();
				userInput = kb.nextInt();
				switch (userInput) {
				case 1:
					field.displayFleet();
					break;
				case 2:
					field.flyAllJets();
					break;
				case 3:
					field.fastestJet();
					break;
				case 4:
					field.longestRange();
					break;
				case 5:
					field.loadCargo();
					break;
				case 6:
					System.out.println("How much cargo (in lbs) do you need to transport?");
					int cargo = kb.nextInt();
					kb.nextLine();
					System.out.println("Where will the cargo be going?");
					String destination = kb.nextLine();
					field.selectAndFlyCargo(destination, cargo);
					break;
				case 7:
					System.out.println("Select a jet to fight a random opponent");
					ArrayList<FighterJet> combatReady = field.dogFightMenu();
					int fightJet = kb.nextInt();
					combatReady.get(fightJet -1).dogFight(combatReady.get((int)Math.random()*combatReady.size()));
					break;
				case 8:
					System.out.println("What kind of jet would you like to add?");
					System.out.println("1) Passenger Jet");
					System.out.println("2) Cargo Jet");
					System.out.println("3) Fighter Jet");
					System.out.println("4) Just a regular old Jet");
					int jetType = kb.nextInt();
					kb.nextLine();
					System.out.println("Enter the model of this jet: ");
					String model = kb.nextLine();
					System.out.println("Enter the speed of the new jet (whole mph):");
					int speed = kb.nextInt();
					kb.nextLine();
					System.out.println("Enter the range of the new jet: ");
					int range = kb.nextInt();
					kb.nextLine();
					System.out.println("Enter the price of the new jet:");
					double price  = kb.nextDouble();
					kb.nextLine();
					if(jetType == 4) {
						field.addJet(jetType, model, speed, range, price, 0);
					}else {
						System.out.println("For a fighter, cargo or passenger jet, enter its fire power, capacity or number of seats as a whole number");
						int spec = kb.nextInt();
						field.addJet(jetType, model, speed, range, price, spec);
					}
					System.out.println("The following jets are now in the fleet: ");
					field.displayFleet();
					break;
				case 9:
					System.out.println("Which jet would you like to remove?");
					field.displayFleet();
					int removalIdx = kb.nextInt();
					field.removeJet(removalIdx);
					System.out.println("The following jets are now in the fleet: ");
					field.displayFleet();
					break;
				case 10:
					System.out.println("How many people will be flying?");
					int people = kb.nextInt();
					kb.nextLine();
					System.out.println("Where will the people be going?");
					destination = kb.nextLine();
					field.selectAndFlyPassengers(destination, people);
					break;
				case 11:
					System.out.println("Bye, then. Have a nice day!");
					break;
				default:
					System.out.println("That input is not recognized. Please enter 1-11.");
					break;

				}
			}
		}catch (Exception e){
			System.out.println("Invalid input has been entered.");
			System.out.println("The program has encountered an error. Restart to begin again.");
		}

	}
	

}
