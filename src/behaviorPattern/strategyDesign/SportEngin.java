package behaviorPattern.strategyDesign;

public class SportEngin implements EngineStrategy{

    @Override
    public void startEngine() {
        System.out.println("Sport Engin has been started..");
    }
}
