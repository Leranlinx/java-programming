import java.util.Scanner;
public class search_item {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean found = true;
        int[] arr = new int[5];

        System.out.println("Enter array element : ");
        for (int i=0; i<arr.length; i++){
            System.out.printf("arr[%d] = ",i);
            arr[i]= input.nextInt();
        }

        for (int i =0; i<arr.length; i++){
            System.out.println("Array element : "+ arr[i]);
        }

        System.out.print("Enter search item : ");
        int searchItem = input.nextInt();
        for (int i=0; i<arr.length; i++){
            if (arr.length == searchItem){
                found = true; 
                break;
            }
        }
        if(found){
            System.out.println(searchItem);
        }
        else{
            System.out.println("Search Item not found ");
        }
    }
}
