package strategyDesignPattern;

import strategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
	
	public DriveStrategy driveObject;
	
	Vehicle(DriveStrategy driveObj){
		this.driveObject = driveObj;
	}
	
	public void drive() {
		driveObject.drive();
	}
	
}
