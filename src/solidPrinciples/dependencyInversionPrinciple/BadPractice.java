package solidPrinciples.dependencyInversionPrinciple;

public class BadPractice {
   // App depends directly on MySQLDatabase. which is not acceptable.
   // If database required change to Oracle then need to change all classes
}

class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL");
    }
}

class App {
    MySQLDatabase db = new MySQLDatabase();
    void saveData() {
        db.save("Data");
    }
}

