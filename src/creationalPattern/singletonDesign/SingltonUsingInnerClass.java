package creationalPattern.singletonDesign;

public class SingltonUsingInnerClass {

    private static class SingltonHelper{
        private static final SingltonUsingInnerClass instance = new SingltonUsingInnerClass();
    }

    public static SingltonUsingInnerClass getInstance(){
        return SingltonHelper.instance;
    }

}
