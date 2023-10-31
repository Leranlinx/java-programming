package static_method;

public class static_method2 {
    static String Car_name;
    static String Brnad_name;
    static int price , top_speed ; 

    // No argument constructro
    public static_method2 (){
        System.out.println("No Argument constructor");
    }

    // All argulment constroctor 
    static_method2 (String n , int p){
        Car_name = n ;
        price = p ;
    }

    void set_informatino (String n , String b, int p ,int t){
        Car_name = n ;
        Brnad_name = b ; 
        price = p ;
        top_speed = t ;
    }

    static void display (){
        System.out.println("Car name : "+ Car_name);
        System.out.println("Car Brand : "+ Brnad_name);
        System.out.println("Car Price : "+price);
        System.out.println("Top speed : "+ top_speed);
    }

    public static void main(String[] args) {
        static_method2 car_1 = new static_method2();
        car_1.set_informatino("BMW A6", "BMW", 1500, 390);
        static_method2.display();
    }
}
