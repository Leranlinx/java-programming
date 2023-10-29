package Static_;

public class static_2 {
    String name,contact ;
    int id ;
    static String country_name = "Bangladesh";  /// Static variable 

    static_2 (String n, String c, int i){
        name= n ;
        contact = c; 
        id = i ;
    }


    //creat method 
    void displayOut (){
        System.out.println("Name : "+name);
        System.out.println("Contact : "+contact);
        System.out.println("id: "+id);
        System.out.println("country: "+country_name);
    }

    public static void main(String[] args) {
        static_2 ob =new static_2("Hello world ", "asdfsadf", 234);
        System.out.println(ob);
        System.out.println("Country name : "+ob.country_name);
    }
    
}
