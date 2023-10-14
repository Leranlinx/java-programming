

/**
 * two_d_array_sum
 */
import java.util.Scanner ;
public class two_d_array_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //2D array declear 
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int [][] c = new int[2][3];

        //user input 'A' Matrix element 
        System.out.println("Ente 'A' Matrix element : ");
        for (int i=0; i<2 ; i++) {
            for (int j=0 ; j<3; j++){
                System.out.printf("a [%d][%d]=",i,j);
                a[i][j]=input.nextInt();
            }
        } 

         //user input 'B' Matrix element..
        System.out.println("Eter 'b' matrix element : ");
        for (int i=0 ; i<2; i++) {
            for (int j=0; j<3; j++){
                System.out.printf("b[%d][%d] = ",i,j);
                b[i][j] =input.nextInt();
            }
        }

        // printing all element 'A' Matrix 
        System.out.println("your 'A' Matrix array element : ");
        for(int i =0; i<2; i++){
            for (int j=0; j<3 ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //printing 'B' Matrix element 
        System.out.println("your 'B' Matrix array element :");
        for (int i=0 ; i<2; i++) {
            for (int j=0; j<3 ; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        //Adding A matrix and B matrix = A+B 
        System.out.println("Adding A matrix and B matrix = A+B ");
        for (int i=0; i>2 ; i++){
            for (int j=0 ;j<3 ;j++){
                c[i][j]=b[i][j]+a[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
