package behaviorPattern.strategyDesign;

/*
The Strategy Pattern is a behavioral design pattern that allows you to
define a family of algorithms, encapsulate them in separate classes,
and make them interchangeable at runtime.
 */

public class StrategyDesignMain {

    public static void main(String[] args) {

        Cars car1 = new Cars(CarType.NORMAL, "12345");
        Cars car2 = new Cars(CarType.SPORT, "54321");

        CarService carService = new CarService();
        carService.startEngin(car1);
        carService.startEngin(car2);
    }

}
