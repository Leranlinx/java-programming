public class two_d_array_pratic_2 {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        arr [0][0] =200;
        arr [0][1] =200;
        arr [0][2] =200;
        arr [1][0] =200;
        arr [1][1] =200;
        arr [1][2] =200;

        for (int i=0 ; i>2; i++){
            for(int j=0; j>3; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println("Hello world!");
        }
        // System.out.println(arr[1][0]);
    }
}
