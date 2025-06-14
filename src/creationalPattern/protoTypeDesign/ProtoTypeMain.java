package creationalPattern.protoTypeDesign;

public class ProtoTypeMain {

    public static void main(String[] args) {

        Employee employeeDummy = new Employee();
        employeeDummy.setCompanyName("Newgen");
        employeeDummy.setDepartment("Trade");
        employeeDummy.setAddress("Noida B-19");

        Employee employee1 = new Employee(employeeDummy);
        employee1.setName("Kaushal");
        employee1.setEmail("kaushal.pandey@newgensoft.com");
        System.out.println(employee1);

        SmartEmployee smartEmpDummy = new SmartEmployee(employeeDummy);
        smartEmpDummy.setDesignation("SSE");

        SmartEmployee smartEmployee1 = new SmartEmployee(smartEmpDummy);
        smartEmployee1.setName("Archit");
        smartEmployee1.setAwards("Rising");
        System.out.println(smartEmployee1);

        SmartEmployee smartEmployee2 = new SmartEmployee(employee1);
        smartEmployee2.setDesignation("SSE");
        smartEmployee2.setAwards("Pinacle");
        System.out.println(smartEmployee2);

        // For geting the copy of the any prototype object now we can use copy method
        SmartEmployee smartEmployee3 = smartEmployee1.copy();
        smartEmployee3.setName("Sakshi");
        smartEmployee3.setAwards("Rising");
        System.out.println(smartEmployee3);


    }

}
