package InterfaceAndAbstruction;

public class Rahim extends PhoneCall implements Food, Sweet{
    void calling(String n){
        System.out.println(n+" is making a call");
    }

    @Override
    public void desert() {
        System.out.println("Desert for night");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch");
    }

    @Override
    public void dinner() {
        System.out.println("Dinner is special");
    }
}
