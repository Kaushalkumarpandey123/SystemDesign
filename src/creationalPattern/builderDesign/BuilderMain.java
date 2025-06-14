package creationalPattern.builderDesign;

public class BuilderMain {

    public static void main(String[] args) {

        Employee employee = null;
        try {
            employee = Employee.builder()
                    .setName("Kaushal")
                    .setAddress("Varanasi")
                    .seteId(1)
                    .setDepartment("Trade")
                    .setManager("Nidhi")
                    .build();
        } catch (NameRequiredException e) {
            throw new RuntimeException(e);
        }
        System.out.println(employee);

        Employee employee1 = null;
        try {
            employee1 = Employee.builder()
                    .seteId(2)
                    .build();
        } catch (NameRequiredException e) {
            throw new RuntimeException(e);
        }
        System.out.println(employee1);


    }

}
