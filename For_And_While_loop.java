import java.util.Scanner;
public class For_And_While_loop {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (var input = new Scanner(System.in)) {
            System.out.print("How much do you want to start with? = ");
            int initial = input.nextInt();
            System.out.print("How much do you want to add up to? = ");
            int u_number =input.nextInt();

            int sum = 0 ;
            // if (initial >0 ) {
            //     System.out.println("Neggtive number !");
            // }
            // else {
            //     System.out.println("__________");
            // }
            // while (initial<u_number){
            //     initial = initial+2 ;
            //     sum = sum + initial;
            //     System.out.println("The even number = "+initial);
            //     System.out.println("Total addition = "+sum);
            // }
            // System.out.println("Total addition = "+sum);

            for (int i =0; i<=u_number ; i++ ) {
                sum = sum + i ;
                System.out.println("The Result = "+ sum);
            }
        }

    }
}
