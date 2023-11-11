package For_filelar.polymorphisom;

public class ciracle extends shape {             // This is sub class is your super class name--> shape 
    public void drow (){
        System.out.println("2. Drowing  a circale ");
        System.out.println("  Your circale created");
    }
    public static void main(String[] args) {
        shape s1 = new shape();
        ciracle c1 = new ciracle();
        c1.drow();
        s1.drow();
    }
}
