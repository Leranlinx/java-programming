package RecursiveFuncation;
import java.util.Scanner;
public class FirstRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A = input.nextInt(); 

        FirstRecursive fr = new FirstRecursive();
        int ans = fr.factorial(A);
        System.out.println("ans : "+ ans);
        
    }
    public int factorial (int val ){
        if (val == 1){
            return 1 ;
        }
        return val * factorial(val - 1);
    }
}
