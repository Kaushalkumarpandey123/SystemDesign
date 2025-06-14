package behaviorPattern.strategyDesign;

public class Cars {
    private CarType carType;
    private String carNumber;
    private EngineStrategy engineStrategy;

    public Cars(CarType carType, String carNumber) {
        this.carType = carType;
        this.carNumber = carNumber;
        this.engineStrategy = EnginFactory.getEnginInstance(carType);
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public EngineStrategy getEngineStrategy() {
        return engineStrategy;
    }

    public void setEngineStrategy(EngineStrategy engineStrategy) {
        this.engineStrategy = engineStrategy;
    }
}
