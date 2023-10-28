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

        int max = a[0][0];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
        two_d_array_sum_practice_2 abc = new two_d_array_sum_practice_2();
        int ans = abc.maxValue(a);
        System.out.println(ans);

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
        // This loop use, 'c' Matrix element print 
        System.out.println("Adding a+b = ");
        for (int i=0 ; i<3; i++){
            for (int j=0 ; j<3 ; j++){
                c [i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
    }

    // This method use, Matrix max value Identefy.
    public int maxValue(int[][] array){
        int max = array[0][0];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
