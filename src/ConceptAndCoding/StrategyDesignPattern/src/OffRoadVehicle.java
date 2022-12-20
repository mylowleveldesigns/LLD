package ConceptAndCoding.StrategyDesignPattern.src;

import ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(DriveStrategy strategy) {
        super(strategy);
    }
}
