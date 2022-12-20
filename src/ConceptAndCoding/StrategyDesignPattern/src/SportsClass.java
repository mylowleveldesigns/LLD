package ConceptAndCoding.StrategyDesignPattern.src;

import ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy.DriveStrategy;

public class SportsClass extends Vehicle{
    public SportsClass(DriveStrategy strategy) {
        super(strategy);
    }
}
