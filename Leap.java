import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("ENTER A NUMBER : ");
        int leap = input.nextInt() ;

        if (leap % 4 == 0 && leap % 100!= 00 && leap %100 != 00){
            System.out.println("This is leap year.");
        }
        else{
            System.out.println("This is not leap year ");
        }
    }
}
