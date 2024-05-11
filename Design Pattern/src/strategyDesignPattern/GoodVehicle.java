package strategyDesignPattern;

import strategyDesignPattern.Strategy.NormalDrivestrategy;

public class GoodVehicle extends Vehicle{

	GoodVehicle() {
		super(new NormalDrivestrategy());
	}

}
