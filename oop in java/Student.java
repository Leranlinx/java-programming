//Introduction class,ovject,method  
// Create simple class templeat 
public class Student {
    String name,gender,contact ;
    int age;

    //Method declear
    void teacher_inpormation (){
        System.out.println("student Name ="+name );
        System.out.println("Age = "+ age);
        System.out.println("Gender = "+gender);
        System.out.println("Mobile = "+ contact);
    }

    public static void main(String[] args) {
        
        // Object create_1 
        Student teacher_1 = new Student();
        teacher_1.name = "Niloy";
        teacher_1.age = 20;
        teacher_1.gender = "male";
        teacher_1.contact = "019283928";

        //object create 2 
        Student teacher_2  = new Student();
        teacher_2.name = "Rafi";
        teacher_2.age = 19;
        teacher_2.gender = "male";
        teacher_2.contact = "017283928";

        // object 1 display output 
        teacher_1.teacher_inpormation();
        //object 2 display output 
        teacher_1.teacher_inpormation();
    }
}
