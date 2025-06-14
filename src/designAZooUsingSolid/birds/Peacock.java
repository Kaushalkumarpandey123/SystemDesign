package designAZooUsingSolid.birds;

public class Peacock extends Birds implements Flyable, Danceable{

    public Peacock(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sound() {

    }

    @Override
    public void color() {
        System.out.println("Peacock " + this.getName() + " has "+this.getColor()+" color ..");
    }

    @Override
    public void flying() {
        System.out.println("Peacock " + this.getName() + " has can fly.");
    }

    @Override
    public void behavior() {
        System.out.println("Peacock " + this.getName() + " is national bird..");
    }

    @Override
    public void dance() {
        System.out.println("Peacock " + this.getName() + " has can dance.");
    }
}
