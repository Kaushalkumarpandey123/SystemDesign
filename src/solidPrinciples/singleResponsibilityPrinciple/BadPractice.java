package solidPrinciples.singleResponsibilityPrinciple;

public class BadPractice {
    // In this Example both work was done in a single class Report
}


class Report {
    public void generateReport() {
        // generate report logic
    }
    public void saveToFile() {
        // file saving logic
    }
}
