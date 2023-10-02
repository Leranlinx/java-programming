import java.util.Scanner;
public class Additon_for_lop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int sum,i,n;
        n = input.nextInt();
        sum = 0 ;
        for (i=0; i<=n;i++){
            sum= sum + i ;
        }
        System.out.println("ANS IS : "+sum);
    }
}
