import java.util.Arrays;
import java.util.Scanner;
/**
 * Array_element_sum_and_Average
 */
public class Array_element_sum_and_Average {

    public static void main(String[] args) {
        // Scanner input = new Scanner (System.in);

        // int [] arr = new int[5];
        // int sum = 0 ; 
        // for (int i=0 ; i<arr.length; i++){
        //     arr[i]=input.nextInt();
        //     System.out.printf("arr[%d] = ",i);
        // }
        // for (int i=0; i<arr.length; i++)_
        //     System.out.println("Array element "+i+" = "+arr[i]);
        //     sum = sum+i ;
        // }
        // System.out.println("Array total sum = "+ sum);
        // int avarage = sum/arr.length; 
        // System.out.println(avarage);
        int sum = 0;
        int[] array = {1,2,300,4,5};
        for (int i=0 ; i<array.length ; i++){
            System.out.println(array[i]);
            sum = sum+i ;
        }
        System.out.println(Arrays.toString(array)); // Display the array correctly

        int average = sum/array.length;
        System.out.println("total average "+average);
        System.out.println("Total sum : " + sum);
    }
}
