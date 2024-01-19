import java.util.*;
public class Matri_big_number {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);

        System.out.print("Enter any posstive number : ");
        int num =input.nextInt();

        int [][] arr_1 = new int[num][num];
        int [][] arr_2 = new int[num][num];
        int [][] C  = new int   [num][num];

        for (int i =0 ;i<num ; i++){
            for (int j =0 ; j<num ; j++){
                System.out.printf ("arr_1 [%d][%d] = ",i,j);
                arr_1 [i] [j]= input.nextInt();
            }
        }

        Matri_big_number obj = new Matri_big_number();
        int ans = obj.Display_array(arr_1);
        System.out.println("Array 2 : " + ans);


        // for (int i=0 ; i<num ; i++){
        //     for (int j=0 ; j<num ; j++){
        //         System.out.print(arr_1[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
    }

    // Array Display sout Method 
    int Display_array (int [][] M_arr){
        for (int i =0 ; i<3 ; i++){
            for (int j =0 ; j<3 ; j++){
                int var = M_arr[i][j];
                System.out.println(var);;
            }
        }
    }
}



//  // This method use, Matrix max value Identefy.
//     public int maxValue(int[][] array){
//         int max = array[0][0];
//         for(int i=0; i<array.length; i++){
//             for(int j=0; j<array.length; j++){
//                 if(array[i][j] > max){
//                     max = array[i][j];
//                 }
//             }
//         }
//         return max;