package Static_;

public class static_3 {
    String defartment  = "Computer science & Technology";
    static int count = 0 ; 

    static_3 (){
        count ++;
    }

    void total_object (){
        System.out.println("Total object : "+ count);
    }

    public static void main(String[] args) {
    static_3 student_1 = new static_3();
    static_3 student_2 = new static_3();
    static_3 student_4 = new static_3();
    

    // System.out.println("Total object : "+static_3.total_object);
    
    student_1.total_object();  
    
    }

}