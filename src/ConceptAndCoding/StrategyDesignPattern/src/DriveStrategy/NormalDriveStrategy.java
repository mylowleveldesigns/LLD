package ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is a normal Drive strategy, Used for usual vehicles");
    }
}
