package problem_solving;
import java.util.Scanner ;
public class prime_number {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Enter a number : ");
            int num = input.nextInt();
            int cout =0;

            for (int i =2; i<num ; i++){
                if (num%i==0){
                    cout++;
                    break ;
                }
            }
            if (cout ==0){
                System.out.println("Is prime number : ");
            }
            else{
                System.out.println("Is not prime number ");
            }
        }

    }
}
