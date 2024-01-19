/**
 * Binary_Search
 */
public class Binary_Search {
    public static int BinarySearch(int[] arr, int SearchItem){
        int left = 0 ;
        int right = arr.length-1 ; 

        while (left<right) {
            int mid = (left +right)/2 ;

            if (mid == SearchItem) {
                return mid ;
            }
            else if (mid < SearchItem){
                left = mid + 1 ;
            }
            else{
                right = mid - 1; 
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70};
        int trgate_valu = 40 ; 
        int result = BinarySearch(array, trgate_valu );

        if (result != -1 ){
            System.out.println("Item not found ");
        }else{
            System.out.println("Item found at index "+ array);
        }

    }
}


