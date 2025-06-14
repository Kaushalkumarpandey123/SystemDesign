package creationalPattern.singletonDesign;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

    private static Singleton instant;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(null == instant){
            synchronized (Singleton.class){
                if(null == instant){
                    instant = new Singleton();
                }
            }
        }
        return instant;
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    public void printSingleton(){
        System.out.println("Inside the Singleton Class.");
    }

    @Override
    public Singleton clone() {
        return getInstance();
        //  throw new CloneNotSupportedException("Cloning not allowed.");
     /* try {
            return (Singleton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }*/
    }
}
