package solidPrinciples.singleResponsibilityPrinciple;

public class GoodPractice {
    // Now we have segregated into two class to do their work seperataly
}


class ReportGenerator {
    public void generateReport() {
        // Only generate report
    }
}

class ReportSaver {
    public void saveToFile() {
        // Only save file
    }
}
