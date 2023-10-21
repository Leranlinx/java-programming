public class Class_6 {
    String name ;
    double id ;
    String defartment;

    //defoult constructor
    //defoult constructor
    //defoult constructor
    //defoult constructor
    Class_6 (){
        System.out.println("No value");
    }

    //use basic prametrized Constructor 
    //use basic prametrized Constructor 
    //use basic prametrized Constructor 
    Class_6(String name, int id , String def){
        name = name;
        id=id ;
        defartment= def;
        // email= email;
    }

    //Basic Method 
    //Basic Method 
    //Basic Method 
    void get_information(){
        System.out.println("Name = "+name);
        System.out.println("Id = "+id);
        System.out.println("Defartment = "+defartment);
    }

    //Basic prametrized method 
    //Basic prametrized method 
    //Basic prametrized method 
    void set_information(String name, int id , String def){
        name = name;
        id=id ;
        defartment= def;
    }

    public static void main(String[] args) {
        Class_6 student = new Class_6("MD Nahimul Islam", 666, "Cse");
        student.get_information();
    }
}
