import java.util.Scanner;
public class Bubble_sort {
    public static void BubbleSort (int[] arr){
        int temp; 
        int n = arr.length ; 

        // Logic Start 
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j<i-n-1 ; j++){
                if (arr[j]> arr[j+1]){
                    // Interchange Value 
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = arr[temp];
                }
            }
        }
    }
    //Chake Bubble sort 
    public static void main(String[] args) {

        // Array user input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int ArrSize = input.nextInt();
        int Myarray [] = new int[ArrSize];

        // Array user input
        System.out.println("Enter array element :");
        for (int i = 0; i < Myarray.length; i++) {
            System.out.printf("Array [%d] : ",i);
            Myarray[i] = input.nextInt();
        }

        // //Array Output 

        // System.out.println("This is unsorted Array element");
        // for (int i = 0; i < Myarray.length; i++) {
        //     System.out.println(Myarray[i]);
        // }

        System.out.println("This is sorted Array element ");
        BubbleSort(Myarray);
        for(int element:Myarray){
            System.out.println(element + " ");
        }


    }
}
