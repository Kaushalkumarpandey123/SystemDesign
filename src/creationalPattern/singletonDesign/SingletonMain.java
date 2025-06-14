package creationalPattern.singletonDesign;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Getting the object of Singleton using the reflection
        Class<?> singleton = Class.forName("creationalPattern.singletonDesign.Singleton");
        Constructor<Singleton> constructor = (Constructor<Singleton>) singleton.getDeclaredConstructor();
        constructor.setAccessible(true);
//        Singleton singleton1 = constructor.newInstance();
//        Singleton singleton2 = constructor.newInstance();
//        System.out.println(singleton1);
//        System.out.println(singleton2);

        // Getting object using the Enum
/*      SingletonUsingEnum usingEnum = SingletonUsingEnum.INSTANCE;
        System.out.println(usingEnum.getName());
        usingEnum.setName("Pandey");
        System.out.println(usingEnum.getName());
        System.out.println(SingletonUsingEnum.INSTANCE.getName());*/

        // Getting the object of the Singleton Class using cloning
 /*     Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = singleton.clone();
        System.out.println(singleton1);
        System.out.println(singleton);*/

        //Getting the object of the Singleton class using the Serializable
      Singleton singleton1 = Singleton.getInstance();
        try {
            // serialize the Singleton instance
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(singleton1);
            out.close();
            // Deserialize the Singleton instance
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            Singleton singleton2 = (Singleton) in.readObject();
            in.close();
            // Print the results to show both references point to the same object
            System.out.println("singleton1: " + singleton1);
            System.out.println("singleton2: " + singleton2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

}
