package RecursiveFuncation;
import java.util.Scanner;

public class PraticeRecursio {
    public int resursive (int n){
        if (n == 1 ) {
            return 1 ;
        }
        return n* resursive(n -1 ) ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter factrial value :");
        int A = input.nextInt();
        PraticeRecursio fr = new PraticeRecursio();
        int ans = fr.resursive(A);
        System.out.println("ANS : "+ ans);
        input.close();
    }
}
