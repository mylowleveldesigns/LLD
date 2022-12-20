package ConceptAndCoding.StrategyDesignPattern.src;

import ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy.NormalDriveStrategy;
import ConceptAndCoding.StrategyDesignPattern.src.DriveStrategy.SlickDriveStrategy;

public class Test {
    public static void main(String[] args) {
        Vehicle testVehicle = new SportsClass(new SlickDriveStrategy());
        testVehicle.drive();

        Vehicle testVehicle2 = new OffRoadVehicle(new SlickDriveStrategy());
        testVehicle2.drive();

        Vehicle testVehicle3 = new PassengerVehicle(new NormalDriveStrategy());
        testVehicle3.drive();
    }
}
