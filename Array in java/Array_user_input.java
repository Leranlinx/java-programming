import  java.util.Scanner; 
public class Array_user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //optimize-1
        int [] arr =  {1,2,3,4,5};
        for (int i=0 ; i<arr.length ; i++) { 
            System.out.println("Array Elements "+i+" = "+arr[i]);
        }
        //optimize-2
        for(int element:arr){
            System.out.println(element);
        }
    }
}
