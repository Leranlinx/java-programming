import java.util.Scanner;
public class Describe_proscedssing_of_array_in_java {
    public static void main(String[] args) {
        int []mylist = {3,4,5,6,67,66,3456};

        // Print all the array elemenst  // print all the array elements
        for (int i=0; i<mylist.length; i++){
            System.out.println("Array Elements : "+mylist[i]);
        }

        //Summing all elements //Summing all elements 
        int sum =0 ; 
        for (int j=0 ; j<mylist.length; j++){
            sum = sum + j ;
        }
        System.out.println("Total Elements sum : "+sum);

        //Finding the big elements //Finding the big elements 

        

    }
}
