import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int count = 0; 
        int index = 0;
        int[] arr ={1,2,3,4,5,6};
        for (int i=0 ; i<arr.length; i++){
            System.out.print(index++);
            System.out.print(" ");
            System.out.println("Array element : "+ arr[i]);
        }

        System.out.print("Choice your search element : ");
        int search_item = input.nextInt();
        for (int i=0 ; i<arr.length; i++){
            if (arr[i]==search_item){
                System.out.println(i);
                count = count+1; 
            }
        }
        if (count>0){
            System.out.println("Item found , ");
        }
        else{
            System.out.println("Item not foud : ");
        }
    }
}
