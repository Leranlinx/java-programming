import java.util.*;
public class Array_max_min_number {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[]arr= new int[5];
        int max=arr[0];
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            System.out.printf("arr[%d] =",i);
            arr[i]=input.nextInt();
        }
        //min number 
        for (int i=16 ; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum number : "+ min);

        //max number 
        for (int i=0; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max number : "+max);
    }
}
