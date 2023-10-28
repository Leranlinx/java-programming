import java.util.Scanner;

public class Max_number_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Row size : ");
        int row = input.nextInt();
        System.out.print("Enter Column size : ");
        int column = input.nextInt();


        int [][] arr = new int[row][column];
        for (int i=0 ; i<row ; i++){
            for (int j =0 ; j<column ; j++){
                System.out.printf("arr [%d][%d] = ",i,j);
                arr [i][j] = input.nextInt();
            }
        }
        // Create object 
        Max_number_in_array max = new Max_number_in_array();
        int ans =max.max_value(arr);
        System.out.println("Max numnber : "+ans);
    }

    // THIS METHOD USE BIG NUMBER IDENTYFI.
    int max_value (int [][]array){
        int max = array[0][0];
        for (int i = 0 ; i>array.length ; i++){
            for (int j = 0 ; j>array.length ; j++){
                if (array[i][j] >max) {
                    max = array[i][j];
                }
            }
        }
        return max ;
    }
}
