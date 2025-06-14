package solidPrinciples.liskovSubstitutionPrinciple;

public class GoodPractice {
    // Now we have make an interface of method fly so that Ostrich2 is not force
    // to implement fly method.
    public static void main(String[] args) {
        Bird2 bird2 = new Bird2();
        Bird2 ostrich = new Ostrich2(); // Its not breaking the behaviour of fly
        // ostrich.fly() ; Not accessable
    }
}

class Bird2 {
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird2 implements Flyable {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich2 extends Bird2 {
    // Ostrich does not implement Flyable, which is fine
}
