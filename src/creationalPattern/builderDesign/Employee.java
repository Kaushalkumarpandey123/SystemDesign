package creationalPattern.builderDesign;


class NameRequiredException extends Exception {
    public NameRequiredException(String message) {
        super(message);
    }
}

public class Employee {
    private final String name;
    private int eId;
    private String address;
    private String manager;
    private String department;
    private String company;
    private String companyCEO;

    // Private constructor to ensure the object is created only via the builder
    private Employee(EmployeeMapper mapper) throws NameRequiredException {
        if (mapper.getName() == null || mapper.getName().isEmpty()) {
            throw new NameRequiredException("Name is required.");
        }
        this.name = mapper.getName();
        this.eId = mapper.geteId();
        this.address = mapper.getAddress();
        this.department = mapper.getDepartment();
        this.manager = mapper.getManager();
        this.company = mapper.getCompany();
        this.companyCEO = mapper.getCompanyCEO();
    }

    // Static builder method that returns an instance of EmployeeMapper
    public static EmployeeMapper builder() {
        return new EmployeeMapper();
    }

    // Inner static class used for the builder pattern
    public static class EmployeeMapper {
        private String name;
        private int eId;
        private String address;
        private String manager;
        private String department;
        private String company;
        private String companyCEO;

        // Default constructor with some default values
        public EmployeeMapper() {
            this.company = "Newgen";
            this.companyCEO = "Nigam";
        }

        // Build method to create the Employee object using the builder pattern
        public Employee build() throws NameRequiredException {
            return new Employee(this);
        }

        // Getter methods for the builder
        public String getName() {
            return name;
        }

        public int geteId() {
            return eId;
        }

        public String getAddress() {
            return address;
        }

        public String getManager() {
            return manager;
        }

        public String getDepartment() {
            return department;
        }

        public String getCompany() {
            return company;
        }

        public String getCompanyCEO() {
            return companyCEO;
        }

        // Setter methods for the builder that return the builder itself
        public EmployeeMapper setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeMapper seteId(int eId) {
            this.eId = eId;
            return this;
        }

        public EmployeeMapper setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeMapper setManager(String manager) {
            this.manager = manager;
            return this;
        }

        public EmployeeMapper setDepartment(String department) {
            this.department = department;
            return this;
        }

        public EmployeeMapper setCompany(String company) {
            this.company = company;
            return this;
        }

        public EmployeeMapper setCompanyCEO(String companyCEO) {
            this.companyCEO = companyCEO;
            return this;
        }
    }

    // Getter and Setter methods for Employee class
    public String getName() {
        return name;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyCEO() {
        return companyCEO;
    }

    public void setCompanyCEO(String companyCEO) {
        this.companyCEO = companyCEO;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eId=" + eId +
                ", address='" + address + '\'' +
                ", manager='" + manager + '\'' +
                ", department='" + department + '\'' +
                ", company='" + company + '\'' +
                ", companyCEO='" + companyCEO + '\'' +
                '}';
    }
}
