package solidPrinciples.dependencyInversionPrinciple;

public class GoodPractice {
    // As definition now App2 dependent on the interface which can be
    // both on the MySQL and Oracle whichever will pass in the
    // constructor of the app2
}

interface Database {
    void save(String data);
}

class MySQLDatabase2 implements Database {
    public void save(String data) {
        System.out.println("Saving to MySQL");
    }
}

class OracleDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving to Oracle");
    }
}

class App2 {
    Database db;
    public App2(Database db) {
        this.db = db;
    }
    void saveData() {
        db.save("Data");
    }
}


