package For_filelar.polymorphisom;

public class shape {           //This is super class --> sub class is circale and rectangle 
    void drow (){
        System.out.println("Drawing a shape");
    }

    public static void main(String[] args) {
        shape c1 = new ciracle();
        shape r1 = new rectangle();
        
        c1.drow();
        r1.drow();
    }
}
