import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First random number = ");
        int sowp_1 = input.nextInt();
        System.out.print("Sceand random number = ");
        int sowp_2 = input.nextInt();

        int temp = sowp_1 ;
        sowp_1 = sowp_2;
        sowp_2 = temp;
        System.out.println("sowp 1 :"+ sowp_1);
        System.out.println("sowp 2 "+sowp_2);
        System.out.println("Hello world !");
        
    }
}
