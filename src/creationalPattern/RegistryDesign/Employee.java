package creationalPattern.RegistryDesign;

public class Employee{

    private String name;
    private String email;
    private String address;
    private String manager;
    private String department;
    private String companyName;

    public Employee(){

    }

    public Employee(Employee employee){
        this.name = employee.name;
        this.email = employee.email;
        this.address = employee.address;
        this.manager = employee.manager;
        this.department = employee.department;
        this.companyName = employee.companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", manager='" + manager + '\'' +
                ", department='" + department + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

}
