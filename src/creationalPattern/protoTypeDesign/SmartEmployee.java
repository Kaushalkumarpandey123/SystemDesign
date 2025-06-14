package creationalPattern.protoTypeDesign;

public class SmartEmployee extends Employee  {

    private String awards;
    private int price;
    private String designation;

    public SmartEmployee() {

    }

    public SmartEmployee(Employee employee) {
        super.setName(employee.getName());
        super.setEmail(employee.getEmail());
        super.setDepartment(employee.getDepartment());
        super.setManager(employee.getManager());
        super.setCompanyName(employee.getCompanyName());
        super.setAddress(employee.getAddress());
    }

    public SmartEmployee(SmartEmployee smartEmployee) {
        this.awards = smartEmployee.getAwards();
        this.price = smartEmployee.getPrice();
        this.designation = smartEmployee.getDesignation();
        super.setName(smartEmployee.getName());
        super.setEmail(smartEmployee.getEmail());
        super.setDepartment(smartEmployee.getDepartment());
        super.setManager(smartEmployee.getManager());
        super.setCompanyName(smartEmployee.getCompanyName());
        super.setAddress(smartEmployee.getAddress());
    }

    @Override
    public SmartEmployee copy() {
        SmartEmployee smartEmployee = new SmartEmployee();
        smartEmployee.setDesignation(this.getDesignation());
        smartEmployee.setDepartment(this.getDepartment());
        smartEmployee.setManager(this.getManager());
        smartEmployee.setCompanyName(this.getCompanyName());
        smartEmployee.setAddress(this.getAddress());
        return smartEmployee;
    }


    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "SmartEmployee{" +
                "name='" + super.getName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", designation='" + designation + '\'' +
                ", awards='" + awards + '\'' +
                ", price=" + price +
                ", address='" + super.getAddress() + '\'' +
                ", manager='" + super.getManager() + '\'' +
                ", department='" + super.getDepartment() + '\'' +
                ", companyName='" + super.getCompanyName() + '\'' +
                '}';
    }

}
