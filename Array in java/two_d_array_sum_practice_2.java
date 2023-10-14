import java.util.Scanner;
public class two_d_array_sum_practice_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        int [][] c = new int[3][3];
        
        System.out.println("Enter matrix element : ");
        for (int i=0 ; i<3 ; i++){
            for (int j=0; j<3 ; j++){
                System.out.printf("b[%d][%d]=",i,j);
                a[i][j]=input.nextInt();
            }
        }

        System.out.println("Enter matrix element : ");
        for (int i=0 ; i<3 ; i++){
            for (int j=0; j<3 ; j++){
                System.out.printf("a[%d][%d]=",i,j);
                b[i][j]=input.nextInt();
            }
        }

        System.out.println("B matrix element : ");
        for (int i=0 ; i<3; i++){
            for (int j=0 ; j<3 ; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("A matrix element : ");
        for (int i=0 ; i<3; i++){
            for (int j=0 ; j<3 ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Adding a+b = ");
        for (int i=0 ; i<3; i++){
            for (int j=0 ; j<3 ; j++){
                c [i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
