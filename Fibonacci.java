import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int fibo_1 = 0;
        int fibo_2 = 1;
        int fibo ;
        int n = input.nextInt();

        for (int i = 0; i<n; i++) {
            fibo = fibo_1 +fibo_2 ;

            fibo_1 = fibo_2; 
            fibo_2 = fibo ;
            System.out.println("The Fibonacci Result = "+fibo);
        }

    }
}
