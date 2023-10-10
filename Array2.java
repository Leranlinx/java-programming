public class Array2 {
    public static void main(String[] args) {

        // using new oprator array 

        int [] array2 = {1,2,2,2,2,2,2,2,2};
        array2 [5] = 122;
        for (int i=0; i<10; i++){
            System.out.println(array2[i]);
        }

        int [] array3 ;
        array3 = new int[]{1,2,3,4,5,6,7,8,9};
        for (int i = 0 ; i<array3.length ; i++) {
            System.out.println(array3[i]);
        }
    }
}
