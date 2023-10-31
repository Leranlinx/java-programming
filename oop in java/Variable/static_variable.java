package Variable;

// import Static_.static_1;

public class static_variable {
    String name,contact ;
    int id ;
    static String country = "Bangladesh";  /// Static variable 

    // creat constacture 
    static_variable (String n, String c, int i){
        name= n ;
        contact = c; 
        id = i ;
        
    }
    // create method display out 
    void displayOut (){
        System.out.println("Name : "+name);
        System.out.println("Contact : "+contact);
        System.out.println("id: "+id);
        System.out.println("country: "+country);

    }
    public static void main(String[] args) {
        static_variable Bird = new static_variable("coco", "123452345", 123);
        Bird.displayOut();
    }
}
