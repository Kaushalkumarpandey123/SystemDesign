package creationalPattern.singletonDesign;

public class SingletonUsingEgar {

    private static final SingletonUsingEgar instance = new SingletonUsingEgar();

    private SingletonUsingEgar(){

    }

    public static SingletonUsingEgar getInstance(){
        return instance;
    }

}
