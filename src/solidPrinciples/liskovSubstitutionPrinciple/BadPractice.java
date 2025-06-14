package solidPrinciples.liskovSubstitutionPrinciple;

public class BadPractice {
    // Here child class (Ostrich) can not be changed by paarent class (Bird)
    // because its breaking the behaviour of fly
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird ostrich = new Ostrich();
        ostrich.fly(); //  Its breaking the behaviour of fly
    }
}

class Bird {
    void fly() {}
}

class Ostrich extends Bird {
    void fly() {
        throw new UnsupportedOperationException("Can't fly");
    }
}
