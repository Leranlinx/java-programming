public class Parametrised_Method {
    String name ,gender ;
    int age , mobile ;

    //parrmetrised method 
    void setinformation (String n, String g, int m, int a){
        name = n ;
        gender = g ;
        mobile = m;
        age= a; 
    }
    //normal method 
    void displayiformatio (){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+ gender);
        System.out.println("Mobile = "+ mobile);
        System.out.println("age = "+age);
    }

}
