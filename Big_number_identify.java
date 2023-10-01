import java.util.Scanner;

public class Big_number_identify {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Your Number : ");
        float a = input.nextInt();
        System.out.print("Enter Your Sceand number : ");
        float b = input.nextInt();

        if (a>b){
            System.out.println("'A' is big number ");
        }
        else {
            System.out.println("'B' is big number ");
        }


    }
}
