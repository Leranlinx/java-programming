import java.util.Scanner;
public class search_data_from_array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] arr = new int[5];
        int count = 0; 

        System.out.println("Enter Array element : ");
        for (int i=0; i<arr.length; i++){
            System.out.printf("a[%d]", i);
            arr[i]=input.nextInt(); 
        }

        System.out.print("Your array element : ");
        for (int i=0 ; i<arr.length; i++){
            System.out.println("Your array element :"+arr[i]);
        }

        System.out.print("Enter searching item = ");
        int search_item =input.nextInt();
        for (int i=0 ; i<arr.length; i++){
            if (arr[i]==search_item){
                count++;
            }
        }
        if (count>0){
            System.out.println("Item found : "+count);
        }
        else{
            System.out.println("item not found "+count);
        }
    }
}
