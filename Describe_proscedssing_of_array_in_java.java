import java.util.Scanner;
public class Describe_proscedssing_of_array_in_java {
    public static void main(String[] args) {
        int []mylist = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        // Extra Item add Mylist
        mylist[5]=2000;
        System.out.println("My list 5 Number Index Item ="+mylist[5]);

        // Print all the array elemenst  // print all the array elements
        for (int i=0; i<mylist.length; i++){
            System.out.println("MY list element : "+mylist[i]);
        }

        //Summing all elements //Summing all elements 
        int sum=0 ;
        for (int i=0; i<mylist.length; i++ ) {
            sum = sum+mylist[i] ;
            System.out.println("The sum Result : "+sum);
        }

        //Finding the big elements //Finding the big elements 
        int max=mylist[0];
        for (int i= 0; i<mylist.length; i++){
            if (mylist[i]>max)max=mylist[i];
        }
        System.out.println("Mylist Max Item : "+ max);
    }
}
