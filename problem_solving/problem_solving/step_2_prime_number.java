package problem_solving;
import java.util.Scanner;
public class step_2_prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter The number : ");
        int num = input.nextInt();
        int cout =0; 

        if (num == 0 || num==1 ){
            System.out.println("Not Prime");
        }else {
            for (int i=2 ; i<num/2 ; i++){
                if (num % i ==0 ){
                    cout++;
                    break;
                }
            }
        }
        if (cout == 0 ){
            System.out.println("Prime Number "+num);
        }
        else {
            System.out.println(" Not prime Number "+num);
        }
    }
}
