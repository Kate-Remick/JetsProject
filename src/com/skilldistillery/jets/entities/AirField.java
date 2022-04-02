package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AirField {
private List<Jet> fleet;

public AirField(String file) {

	try(BufferedReader br = new BufferedReader(new FileReader(file))){
		String line = br.readLine();
		while(line != null) {
			//Each line is an aircraft - the first string is the type of jet
		}
		
		
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}


}
