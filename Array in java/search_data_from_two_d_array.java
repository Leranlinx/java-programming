import java.util.Scanner;
public class search_data_from_two_d_array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int count =0 ; 
        int[][] arr = {{1,1,1},{1,1,1}};
        
        for (int i =0 ; i<3; i++){
            for (int j =0 ; j<3 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter search element ");
        int search_item = input.nextInt();

        for (int i =0 ; i<3; i++){
            for (int j =0 ; j<3; j++){
                if (arr[i][j]==search_item){
                    count ++;
                }
            }
        }
    }
}
