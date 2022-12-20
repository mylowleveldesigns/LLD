package ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy;

public class SlickDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is a Slick Drive Stragtegy, Used for Best In Class Vehicles");
    }
}
