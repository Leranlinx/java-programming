
import java.util.Scanner ;
public class two_d_array_pratic_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [][] A = new int[2][3];
        int [][] B = new int[2][3];
        
        //user input all element 
        System.out.print("Enter your 2D array element : ");
        for (int i=0 ; i<2 ; i++) {
            for (int j=0 ; j<3; j++){
                A[i][j] =input.nextInt();
            }
        }

        //printing all element 
        System.out.println("Your array element : ");
        for (int i=0 ; i<2 ; i++){
            for (int j=0; j<3 ;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println(); 
        }
        // System.out.println();
    }
}
