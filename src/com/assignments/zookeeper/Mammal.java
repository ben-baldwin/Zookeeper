package com.assignments.zookeeper;

public class Mammal {
	public int energyLevel;

//	EMPTY CONSTRUCTOR
	public Mammal() {
		this.energyLevel = 100;
	}
	
//	FULL CONSTRUCTOR
	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}

// GETTERS AND SETTERS / OTHER METHODS
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	
}
