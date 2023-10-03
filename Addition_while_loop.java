import java.util.Scanner;
public class Addition_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a Random number ; ");
        int n = input.nextInt();
        int i = input.nextInt();
        int sum =0;

        while (i <n){
            i++;
            sum = sum + i ;
        }
        System.out.println("ANS :"+ sum);
    }
}
