package creationalPattern.FactoryDesign;

import java.util.HashMap;
import java.util.Map;

public final class Factory<T> {

    private final Map<Class<T>, T> objMapper = new HashMap<>();

    private static Factory instance;

    private Factory(){

    }

    public static Factory getInstance(){
        if(null == instance){
            instance = new Factory();
            return instance;
        }
        return instance;
    }

    // Method to register an object by class type
    public void register(Class<T> clazz, T object) {
        objMapper.put(clazz, object);
    }

    public T get(Class<T> clazz) {
        return objMapper.get(clazz);
    }

    public Map<Class<T>, T> getObjMapper() {
        return objMapper;
    }
}
