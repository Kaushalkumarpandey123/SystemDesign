package solidPrinciples.openClosedPrinciple;

public class BadPractice {
    // Here If we have to add any other payment method then we have to
    // modify the Payment Service Class
}

class PaymentService {
    public void pay(String type) {
        if (type.equals("card")) {
            // card payment
        } else if (type.equals("upi")) {
            // upi payment
        }
    }
}
