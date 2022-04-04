package com.skilldistillery.jets.app;

import java.util.Scanner;
import com.skilldistillery.jets.entities.*;

public class JetsApplication {
	Scanner kb;

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		String jets = "Jets.txt";
		AirField field = new AirField(jets);
		app.run(app, field);

	}

	private void displayMenu() {
		System.out.println("*--- Select an Option ---*");
		System.out.println("1) List all jets in the fleet");
		System.out.println("2) View fastest jet");
		System.out.println("3) View jet with the longest range");
		System.out.println("4) Load all cargo jets");
		System.out.println("5) Transport cargo");
		System.out.println("6) Transport passengers");
		System.out.println("7) Dogfight!");
		System.out.println("8) Add a jet to the fleet");
		System.out.println("9) Remove a jet from the fleet");
		System.out.println("10) Quit");

	}

	public void run(JetsApplication app, AirField feild) {
		System.out.println("Welcome to the Jets Application.");
		try {
			int userInput = 0;
			while (userInput != 10) {
				app.displayMenu();
				switch (userInput) {
				case 1:
					feild.toString();
					break;
				case 2:
					feild.flyAllJets();
					break;
				case 3:
					feild.fastestJet();
					break;
				case 4:
					feild.longestRange();
					break;
				case 5:
					feild.loadCargo();
					break;
				case 6:
					//write code for transports cargo
					break;
				case 7:
					//write dogfigth stuff
					break;
				case 8:
					feild.addJet();
					break;
				case 9:
					//write remove jet code
					break;
				case 10:
					System.out.println("Bye, then. Have a nice day!");
					break;
				default:
					System.out.println("That input is not recognized. Please enter 1-10.");
					break;

				}
			}
		} catch (Exception e) {
			
		}

	}
	

}
