public class Constructor_Overloading {
    String name ,gender; 
    int phone , age ;

        ///Method Creat 
    void get_information (){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone = "+phone);
        System.out.println("AGE = "+ age);
    }

    //Constructor 0
    Constructor_Overloading(){
        System.out.println("No Information");
    }
    //Constructor 1
    Constructor_Overloading(String name, int phone, int age){
        // name = name; 
        // phone = phone;
        // age = age; 
    }
    //Constructor 2
    Constructor_Overloading(String name, int phone){
        // name = name; 
        // phone = phone;
    }
    //Constructor 3
    Constructor_Overloading(String n, String g, int p, int a){
        name = n; 
        gender =g; 
        phone = p;
        age = a; 
    }
    
    //object creat //object creat //object creat //object creat //object creat //object creat //object creat 
    public static void main(String []args){
        //object__1
        Constructor_Overloading s_1 = new Constructor_Overloading("Md Nshimul Islam", "Male", 123, 20);
        s_1.name= "Md Nahimul Islam ";
        System.out.println(s_1.name);
        s_1.get_information();

        //object 2
        Constructor_Overloading s_2 = new Constructor_Overloading();
        s_2.get_information();


    }

}


