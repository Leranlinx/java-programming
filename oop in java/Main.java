public class Main {
//Introduction class,ovject,method  
//Introduction class,ovject,method  
//Introduction class,ovject,method  
//Introduction class,ovject,method  

    public static void main(String[] args) {
        // object creat '1'
        Student student_1 =new Student();
        student_1.name = "Md Nahimul Islam";
        student_1.gender = "Male";
        student_1.age = 19 ;
        student_1.mobile = 123456789;

        // System.out.println("Student-1 Name = "+student_1.name );
        // System.out.println("Student-1 age = "+student_1.age );
        // System.out.println("Student-1 gender = "+student_1.gender );
        // System.out.println("Student-1 mobile = "+student_1.mobile );
        // student_1.student_inpormation();

        //object creat '2'
        Student student_2 =new Student();
        student_2.name = "Md Nahimul Islam rafi";
        student_2.gender = "Male";
        student_2.age = 20 ;
        student_2.mobile =12345;

        // System.out.println("Student-1 Name = "+student_2.name );
        // System.out.println("Student-1 age = "+student_2.age );
        // System.out.println("Student-1 gender = "+student_2.gender );
        // System.out.println("Student-1 mobile = "+student_2.mobile );
        // student_2.student_inpormation();

        Parametrised_Method teacher_1 = new Parametrised_Method();
        teacher_1.setinformation("Md Nahimul Islam ", "Male", 234543, 19);
        teacher_1.displayiformatio();

    }
}
