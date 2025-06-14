package behaviorPattern.strategyDesign;

public class CarService {
    public void startEngin(Cars car){
        car.getEngineStrategy().startEngine();
    }
}
