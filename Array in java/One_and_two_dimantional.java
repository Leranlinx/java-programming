/**
 * One_and_two_dimantional
 */
import java.util.Scanner;
public class One_and_two_dimantional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] arr = {{1,1,1},{2,2,2}};
        for(int i=0; i<2 ; i++){
            for (int j=0; j<3 ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }
    }
}

