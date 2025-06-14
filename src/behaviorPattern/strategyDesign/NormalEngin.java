package behaviorPattern.strategyDesign;

public class NormalEngin implements EngineStrategy{

    @Override
    public void startEngine() {
        System.out.println("Normal Engin has been started..");
    }
}
