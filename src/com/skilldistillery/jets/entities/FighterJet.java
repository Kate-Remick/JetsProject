package com.skilldistillery.jets.entities;

public class FighterJet extends JetImplement implements DogFight  {
	int gunPower;
	
	public FighterJet(String model, int speed, int range, double price, int gunPower) {
		super(model, speed, range, price);
		this.gunPower = gunPower;
		
	}
	public FighterJet() {}
	
	
	@Override
	public void dogFight(FighterJet maverick) {
		System.out.println(this.model + " enters a dog fight with " + maverick.model + "...");
		int speedDiff = this.speed - maverick.speed;
		int rangeDiff = this.range - maverick.range;
		if(this.model.equals("The Goose") || maverick.model.equals("The Goose")) {
			System.out.println("Honk Honk");
			System.out.println("M_Feathers");
			System.out.println("The Goose always wins.");
		}
		else if(speedDiff + rangeDiff > 0 && this.gunPower > maverick.gunPower) {
			System.out.println("BR-RRR-T-T-T");
			System.out.println("POW-POW");
			System.out.println("POW-POW");
			System.out.println("BANG!");
			System.out.println("SHEEEEOWP!");
			System.out.println(this.model + " Wins!");
		}else if (speedDiff + rangeDiff > 0 || this.gunPower > maverick.gunPower) {
			System.out.println("POW-POW B-R-R-R-O-PP");
			System.out.println("BR-RRR-T-T-T");
			System.out.println("POW-POW");
			System.out.println("BANG!");
			System.out.println("SH-sh-sh-sh-Tr-r-r-sttt!");
			boolean coinFlip = (Math.random() > 0.5);
			if(coinFlip) {
				System.out.println(this.model + " Wins!");
			}else {
				System.out.println(maverick.model + " Wins!");
			}
		}else {
			System.out.println("BR-RRR-T-T-T");
			System.out.println("POW-POW B-R-R-R-O-PP");
			System.out.println("POW-POW");
			System.out.println("POP-SssssKKKkTT");
			System.out.println("BANG!");
			System.out.println(maverick.model + " Wins!");
		}
		
		
	}
	
	
	public int getGunPower() {
		return gunPower;
	}
	@Override
	public String toString() {
		return "FighterJet [gunPower=" + gunPower + ", model=" + model + ", speed=" + speed + ", range=" + range
				+ ", price=" + price + "]";
	}
	

}
