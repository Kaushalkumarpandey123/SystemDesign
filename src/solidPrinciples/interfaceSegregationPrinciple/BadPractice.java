package solidPrinciples.interfaceSegregationPrinciple;

public class BadPractice {
   // Robot shouldn't be forced to implement eat().
}

interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {
        System.out.println("Robot working");
    }

    public void eat() {
        // Not applicable
        throw new UnsupportedOperationException();
    }
}


