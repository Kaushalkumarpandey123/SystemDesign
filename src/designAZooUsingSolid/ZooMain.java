package designAZooUsingSolid;

import designAZooUsingSolid.birds.*;

public class ZooMain {

    public static void main(String[] args) {
        System.out.println("Zoo started..");
        Birds bird1 = new Crow("crow1", "Black", 10);
        Birds bird2 = new Owl("owl1", "Brown", 20);
        Birds bird3 = new Peacock("peacock1", "Green", 15);

        bird1.color();
        bird2.behavior();
        bird3.behavior();

    }
}
