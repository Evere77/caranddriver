package com.project.caranddriver;

public class Driver extends Car {
	
	
	
	
	public void drive() {
		gas--;
		System.out.println("driving");
		status();
	}
	public void boost() {
		gas -= 3;
		System.out.println("Hit that boost!");
		status();
	}
	public void refuel() {
		gas += 2;
		System.out.println("Refuel that bitch");
		status();
	}
}
