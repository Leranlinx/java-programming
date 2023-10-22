package LearnJavaProject;

public class parrot implements Bird{

    @Override
    public void canFly() {
        System.out.println("It can fly");
    }

    @Override
    public void canSing() {
        System.out.println("It can Sing");
    }
    
}
