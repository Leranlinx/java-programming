import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner (System.in);

        System.out.print("Enter any number : ");
        int n = input.nextInt();
        int count = 0 ; 

        for (int i=0 ; i<n ; i++){
            for (int j =0 ; j<n ; j++){
                count = count +1 ;
            }
        }
        System.out.println("n : "+ n + "count : "+ count);

        
    }
}
