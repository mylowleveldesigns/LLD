package ConceptAndCoding.StrategyDesignPattern.src;

import ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy.DriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(DriveStrategy strategy) {
        super(strategy);
    }
}
