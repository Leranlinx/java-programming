public class Class_1 {
    String name ;
    String gender;
    int age ;
    String number ;

    void displayout (){
        System.out.println("Name : "+ name);
        System.out.println("Gender : "+ gender);
        System.out.println("Age : "+ age);
        System.out.println("Number : "+ number);
    }

    public static void main(String[] args) {
        Class_1 student_1 = new Class_1();
        student_1.name = "Niloy";
        student_1.gender = "Male";
        student_1.age = 20;
        student_1.number = "0193873922";        
        
        Class_1 student_2 = new Class_1();
        student_2.name = "rafi";
        student_2.gender = "Male";
        student_2.age = 19;
        student_2.number = "0183873922";

        student_1.displayout();

        student_2.displayout();

    }
}
