// this programming use constrature

public class Class_4 {
    String car_brand;
    int car_price; 
    int car_top_speed;

    //creat Constrator
    Class_4(String n , int s, int top){
        car_brand=n;
        car_price=s ;
        car_top_speed= top;
    }

    //creat method 
    void get_information (String n, int p,int top){
        car_brand= n;
        car_price= p;
        car_top_speed=top;
    }

    //this method use output informatino
    void car_information (){
        System.out.println("Car Brand = "+car_brand);
        System.out.println("Car prince = "+car_price);
        System.out.println("Car top speed = "+ car_top_speed);
    }
}
