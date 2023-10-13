import java.util.Scanner ;
public class two_d_array_pratic_1 {
    public static void main(String[] args) {
        int[][] arr = {{1,14,15,16},{22,23,24,25}};
        // System.out.print("2D array element : ");

        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
