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
	try(BufferedReader br = new BufferedReader(new FileReader(file))){
		String line = br.readLine();
		while(line != null) {
			String[] jetData= line.split(",");
			switch(jetData[0]) {
			case "FighterJet":
				fleet.add(new FighterJet(jetData[1],Integer.parseInt(jetData[2]),Integer.parseInt(jetData[3]),Double.parseDouble(jetData[4])));
				break;
			case "PassengerJet":
				fleet.add(new PassengerJet());
				break;
			case "CargoJet":
				fleet.add(new CargoJet());
				break;
				
			}
		}
		
		
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}


}
