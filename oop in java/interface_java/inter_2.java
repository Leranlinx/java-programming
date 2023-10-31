package interface_java;

interface car {
    public void can_auto_drive();
    public void can_fly();
    
}
public class inter_2 {
    public static void main(String[] args) {
        car car_1 = new bmw();
        car_1.can_auto_drive();

        
    }
}
