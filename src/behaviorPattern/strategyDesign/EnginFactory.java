package behaviorPattern.strategyDesign;

public class EnginFactory {

    public static EngineStrategy getEnginInstance(CarType carType){
        return switch (carType) {
            case SPORT -> new SportEngin();
            case NORMAL -> new NormalEngin();
            default -> throw new IllegalArgumentException("Unknown CarType :"+carType.toString());
        };
    }

}
