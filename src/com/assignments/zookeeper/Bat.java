package com.assignments.zookeeper;

public class Bat extends Mammal {
	
//	CONSTRUCTORS
	public Bat() {
		super(300);
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("reeeeeeee!");
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("yummy blood😬");
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("the town is burning!");
	}
}
