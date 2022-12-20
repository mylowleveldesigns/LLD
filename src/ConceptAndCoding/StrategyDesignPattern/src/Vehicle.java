package ConceptAndCoding.StrategyDesignPattern.src;

import ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy strategy){
        this.driveStrategy = strategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
