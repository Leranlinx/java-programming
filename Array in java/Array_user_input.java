import  java.util.Scanner; 
public class Array_user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //array print all element 
        int [] arr =  {1,2,3,4,5};
        for (int i=0 ; i<arr.length ; i++) { 
            System.out.println("Array Elements "+i+" = "+arr[i]);
        }

        //difference type array all elenent print 
        for(int element:arr){
            System.out.println(element);
        }

        // new array declear 
        int[] array = new int[10];
        for (int i= 0 ; i<array.length ; i++) {
            System.out.print("Enter yout array number  : ");
            System.out.println(array[i]);
        }
        array[5]= 100;
        System.out.println(array[5]);

        //array user input 
        
    }   
}
