import java.util.Scanner ;
public class outer_and_inout_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        
        for (int i = 0 ; i<= n ; i++){
            for (int j = 0; j<=m ; j++){
                if ((i==1)||(j==1)||(i==n)||(j==m)){
                    System.out.print("*");
                }
                else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
