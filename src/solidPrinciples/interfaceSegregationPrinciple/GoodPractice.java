package solidPrinciples.interfaceSegregationPrinciple;

public class GoodPractice {
    // Segregated the Work Interface into two interfaces
    // Now Robot2 is not force to implement the eat method
}

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot2 implements Workable {
    public void work() {
        System.out.println("Robot working");
    }

}
