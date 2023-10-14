import java.util.Scanner;
public class Array_element_sum_and_Average {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        
        int sum =0 ;
        int []arr = new int[3];
        for (int i =0; i<3; i++){
            System.out.printf("arr[%d] = ",i);
            arr[i] = input.nextInt();
        }
        for (int j=0 ; j<3; j++){
            sum = sum+j;
            System.out.println(sum);
        }

    }
}
