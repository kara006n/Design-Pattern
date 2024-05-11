package strategyDesignPattern;

import strategyDesignPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

	OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}

}
