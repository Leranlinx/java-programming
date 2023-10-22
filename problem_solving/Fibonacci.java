package problem_solving;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number : ");
        int num =input.nextInt();
        int first = 0;
        int scend =1 ;
        int fibo;

        for (int i=0; i<num; i++){
            fibo = first +scend ;
            System.out.println(fibo);
            first = scend ;
            scend = fibo ;
        }
    }
}
