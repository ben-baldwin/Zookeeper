package com.assignments.zookeeper;

public class Gorilla extends Mammal {

//	CONSTRUCTORS
	public Gorilla() {
		super();
	}
	
//	GETTERS SETTERS OTHER METHODS
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println ("the gorilla has thrown something");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println ("the gorilla has eaten a banana. Gorilla happy. its energy level is now " + this.energyLevel);
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println ("the gorilla climbed a tree. Its energy level is now " + this.energyLevel);
	}
}
