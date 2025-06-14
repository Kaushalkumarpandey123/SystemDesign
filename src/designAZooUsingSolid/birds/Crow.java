package designAZooUsingSolid.birds;

public class Crow extends Birds implements Flyable {

    public Crow(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sound() {

    }

    @Override
    public void color() {
        System.out.println("Crow " + this.getName() + " has "+this.getColor()+" color ..");
    }

    @Override
    public void behavior() {
        System.out.println("Crow " + this.getName() + " is intelligent..");
    }

    @Override
    public void flying() {
        System.out.println("Crow " + this.getName() + " can fly.");
    }
}
