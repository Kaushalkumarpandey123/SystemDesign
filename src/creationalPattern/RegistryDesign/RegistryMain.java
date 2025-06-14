package creationalPattern.RegistryDesign;

public class RegistryMain {

    public static void main(String[] args) {

        Employee employeeDummy = new Employee();
        employeeDummy.setCompanyName("Newgen");
        employeeDummy.setDepartment("Trade");
        employeeDummy.setAddress("Noida B-19");

        SmartEmployee smartEmpDummy = new SmartEmployee(employeeDummy);
        smartEmpDummy.setDesignation("SSE");

        Registory registory = Registory.getInstance();

        registory.register(Employee.class, employeeDummy);
        registory.register(SmartEmployee.class, smartEmpDummy);
        System.out.println(registory.getObjMapper());

        Employee employee1 = (Employee) registory.get(Employee.class);
        employee1.setName("Kaushal");
        employee1.setEmail("kaushal.pandey@newgensoft.com");
        System.out.println(employee1);

        SmartEmployee smartEmployee1 = (SmartEmployee) registory.get(SmartEmployee.class);
        smartEmployee1.setName("Archit");
        smartEmployee1.setAwards("Rising");
        System.out.println(smartEmployee1);


    }

}
