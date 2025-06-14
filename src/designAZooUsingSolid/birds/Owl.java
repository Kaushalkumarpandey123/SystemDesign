package designAZooUsingSolid.birds;

public class Owl extends Birds implements Flyable {

    public Owl(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sound() {

    }

    @Override
    public void color() {
        System.out.println("Owl " + this.getName() + " has "+this.getColor()+" color ..");
    }

    @Override
    public void flying() {

    }

    @Override
    public void behavior() {
        System.out.println("Owl " + this.getName() + " can see in night..");
    }

}
