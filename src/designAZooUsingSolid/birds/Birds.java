package designAZooUsingSolid.birds;

public abstract class Birds {

    private final String name;
    private final String color;
    private final int age;

    public Birds(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void sound();
    public abstract void color();
    public abstract void behavior();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

}
