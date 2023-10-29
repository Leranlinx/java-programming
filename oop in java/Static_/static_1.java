package Static_;

public class static_1 {
    String name,contact ;
    int id ;
    static String country = "Bangladesh";  /// Static variable 

    // creat constacture 
    static_1 (String n, String c, int i){
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
        static_1 Bird = new static_1("coco", "123452345", 123);
        Bird.displayOut();
    }
    
}
