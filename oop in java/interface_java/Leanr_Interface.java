package interface_java;
interface Bird{
    public void canFly();
    public void canSing();
}

public class Leanr_Interface{
    public static void main(String[] args) {
        Bird b = new pejion();
        b.canFly();
        b.canSing();

        Bird p = new parrot();
        p.canFly();
        p.canSing();
    }
}
