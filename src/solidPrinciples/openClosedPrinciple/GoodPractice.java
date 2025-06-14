package solidPrinciples.openClosedPrinciple;

public class GoodPractice {
    // Now we can extend by adding new classes, without changing existing ones.
    // which method required can be pass in Payment Service constructor.
}

interface Payment {
    void pay();
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
class PaymentService2 {
    public void processPayment(Payment payment) {
        payment.pay(); // No need to modify this class when adding new types
    }
}
