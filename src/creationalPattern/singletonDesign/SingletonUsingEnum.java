package creationalPattern.singletonDesign;

public enum SingletonUsingEnum {

    INSTANCE("Kaushal");
    private String name;

    SingletonUsingEnum(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
